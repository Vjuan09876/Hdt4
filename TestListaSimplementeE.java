import org.junit.Test;
import static org.junit.Assert.*;

public class TestListaSimplementeE {

    @Test
    public void testAddAndSize() {
        ListaSimplementeEncadenada<Integer> lista = new ListaSimplementeEncadenada<>();
        lista.add(10);
        lista.add(20);

        assertEquals(2, lista.size());
        assertFalse(lista.isEmpty());
    }

    @Test
    public void testGetLast() {
        ListaSimplementeEncadenada<String> lista = new ListaSimplementeEncadenada<>();
        lista.add("A");
        lista.add("B");

        assertEquals("B", lista.getLast());
    }

    @Test
    public void testRemoveLast() {
        ListaSimplementeEncadenada<Integer> lista = new ListaSimplementeEncadenada<>();
        lista.add(1);
        lista.add(2);

        Integer removed = lista.removeLast();

        assertEquals(Integer.valueOf(2), removed);
        assertEquals(1, lista.size());
        assertEquals(Integer.valueOf(1), lista.getLast());
    }

    @Test(expected = RuntimeException.class)
    public void testRemoveLastThrowsExceptionWhenEmpty() {
        ListaSimplementeEncadenada<Integer> lista = new ListaSimplementeEncadenada<>();
        lista.removeLast();
    }
}