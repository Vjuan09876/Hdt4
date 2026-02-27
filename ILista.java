public interface ILista<T> {

    void add(T element);          // agregar al final
    T removeLast();               // eliminar último
    T getLast();                  // obtener último
    int size();
    boolean isEmpty();
}