public abstract class PilaAbstracta<T> implements IPila<T> {

    @Override
    public boolean estaVacia() {
        return size() == 0;
    }
}