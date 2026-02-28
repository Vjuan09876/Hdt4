import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            File file = new File("datos.txt");
            Scanner lector = new Scanner(file);

            if (!lector.hasNextLine()) {
                System.out.println("Archivo vacío");
                return;
            }

            String infix = lector.nextLine();
            lector.close();

            // Cambia aquí la implementación si quieres
            IPila<Character> pilaOperadores = new PilaArrayList<>();
            IPila<Integer> pilaNumeros = new PilaArrayList<>();

            String postfix = CalculadoraExpresiones.infixToPostfix(infix, pilaOperadores);
            int resultado = CalculadoraExpresiones.evaluarPostfix(postfix, pilaNumeros);

            System.out.println("Infix: " + infix);
            System.out.println("Postfix: " + postfix);
            System.out.println("Resultado: " + resultado);

        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo datos.txt");
        }
    }
}