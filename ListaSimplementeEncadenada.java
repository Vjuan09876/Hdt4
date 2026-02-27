public class ListaSimplementeEncadenada<T> extends ListaAbstracta<T> {

    private class Nodo {
        T data;
        Nodo next;

        Nodo(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Nodo head;

    @Override
    public void add(T element) {
        Nodo nuevo = new Nodo(element);

        if (head == null) {
            head = nuevo;
        } else {
            Nodo temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = nuevo;
        }

        size++;
    }

    @Override
    public T removeLast() {
        if (isEmpty()) {
            throw new RuntimeException("Lista vacía");
        }

        if (head.next == null) {
            T data = head.data;
            head = null;
            size--;
            return data;
        }

        Nodo temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        T data = temp.next.data;
        temp.next = null;
        size--;
        return data;
    }

    @Override
    public T getLast() {
        if (isEmpty()) {
            throw new RuntimeException("Lista vacía");
        }

        Nodo temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        return temp.data;
    }
}