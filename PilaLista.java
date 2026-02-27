public class PilaLista<T> extends PilaAbstracta<T> {

    private ILista<T> lista;

    public PilaLista(ILista<T> lista) {
        this.lista = lista;
    }

    @Override
    public void push(T element) {
        lista.add(element);
    }

    @Override
    public T pop() {
        return lista.removeLast();
    }

    @Override
    public T peek() {
        return lista.getLast();
    }

    @Override
    public int size() {
        return lista.size();
    }
}