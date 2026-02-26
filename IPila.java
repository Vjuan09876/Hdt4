public interface IPila<T> {
    void push(T item);
    T pop();
    T peek();
    boolean estaVacia();
    int size();
}
