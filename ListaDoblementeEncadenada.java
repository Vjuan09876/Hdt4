public class ListaDoblementeEncadenada<T> extends ListaAbstracta<T> {

    private class Nodo {
        T data;
        Nodo next;
        Nodo prev;

        Nodo(T data) {
            this.data = data;
        }
    }

    private Nodo head;
    private Nodo tail;

    @Override
    public void add(T element) {
        Nodo nuevo = new Nodo(element);

        if (head == null) {
            head = tail = nuevo;
        } else {
            tail.next = nuevo;
            nuevo.prev = tail;
            tail = nuevo;
        }

        size++;
    }

    @Override
    public T removeLast() {
        if (isEmpty()) {
            throw new RuntimeException("Lista vacía");
        }

        T data = tail.data;

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }

        size--;
        return data;
    }

    @Override
    public T getLast() {
        if (isEmpty()) {
            throw new RuntimeException("Lista vacía");
        }

        return tail.data;
    }
}