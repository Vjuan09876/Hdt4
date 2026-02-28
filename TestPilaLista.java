import org.junit.Test;
import static org.junit.Assert.*;

public class TestPilaLista {

    @Test
    public void testPilaListaWithSimpleList() {
        PilaLista<Integer> pila =
                new PilaLista<>(new ListaSimplementeEncadenada<>());

        pila.push(1);
        pila.push(2);

        assertEquals(Integer.valueOf(2), pila.peek());
        assertEquals(Integer.valueOf(2), pila.pop());
        assertEquals(1, pila.size());
    }

    @Test
    public void testPilaListaWithDoubleList() {
        PilaLista<String> pila =
                new PilaLista<>(new ListaDoblementeEncadenada<>());

        pila.push("Hola");
        pila.push("Mundo");

        assertEquals("Mundo", pila.peek());
    }

    @Test(expected = RuntimeException.class)
    public void testPopThrowsExceptionWhenEmpty() {
        PilaLista<Integer> pila =
                new PilaLista<>(new ListaSimplementeEncadenada<>());

        pila.pop();
    }
}