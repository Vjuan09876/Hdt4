public class CalculadoraExpresiones {

    // 🔹 Convierte Infix a Postfix (soporta números de varios dígitos)
    public static String infixToPostfix(String infix, IPila<Character> pila) {

        StringBuilder postfix = new StringBuilder();
        StringBuilder numero = new StringBuilder();

        for (int i = 0; i < infix.length(); i++) {

            char c = infix.charAt(i);

            // Si es número, construir número completo (ej: 10, 20)
            if (Character.isDigit(c)) {
                numero.append(c);
            } else {

                // Si había número acumulado, lo agregamos
                if (numero.length() > 0) {
                    postfix.append(numero).append(" ");
                    numero.setLength(0);
                }

                if (c == '(') {
                    pila.push(c);
                }

                else if (c == ')') {
                    while (!pila.estaVacia() && pila.peek() != '(') {
                        postfix.append(pila.pop()).append(" ");
                    }
                    pila.pop(); // quitar '('
                }

                else if (esOperador(c)) {
                    while (!pila.estaVacia() &&
                           precedencia(c) <= precedencia(pila.peek())) {
                        postfix.append(pila.pop()).append(" ");
                    }
                    pila.push(c);
                }
            }
        }

        // Si quedó número pendiente
        if (numero.length() > 0) {
            postfix.append(numero).append(" ");
        }

        // Vaciar pila
        while (!pila.estaVacia()) {
            postfix.append(pila.pop()).append(" ");
        }

        return postfix.toString().trim();
    }

    // 🔹 Evaluar Postfix
    public static int evaluarPostfix(String postfix, IPila<Integer> pila) {

        String[] tokens = postfix.split(" ");

        for (String token : tokens) {

            if (esNumero(token)) {
                pila.push(Integer.parseInt(token));
            } else {

                int b = pila.pop();
                int a = pila.pop();

                switch (token) {
                    case "+": pila.push(a + b); break;
                    case "-": pila.push(a - b); break;
                    case "*": pila.push(a * b); break;
                    case "/": pila.push(a / b); break;
                }
            }
        }

        return pila.pop();
    }

    private static boolean esOperador(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    private static boolean esNumero(String s) {
        return Character.isDigit(s.charAt(0));
    }

    private static int precedencia(char op) {
        switch (op) {
            case '+':
            case '-': return 1;
            case '*':
            case '/': return 2;
        }
        return 0;
    }
}