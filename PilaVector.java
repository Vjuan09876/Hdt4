import java.util.Vector;

public class PilaVector<T> extends PilaAbstracta<T> {
    private Vector<T> nucleo;

    public PilaVector() {
        nucleo = new Vector<>();
    }
    @Override
    public void push(T item) {
        nucleo.add(item);
    }

    @Override
    public T pop() {
        if (estaVacia()) {
            return null;
        }
        return nucleo.remove(nucleo.size() -1);
    }

    @Override
    public T peek() {
        if (estaVacia()) {
            return null;
        }
        return nucleo.get(nucleo.size() -1);
    }

    @Override
    public int size() {
        return nucleo.size();
    }
}