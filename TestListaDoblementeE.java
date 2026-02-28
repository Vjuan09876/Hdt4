import org.junit.Test;
import static org.junit.Assert.*;

public class TestListaDoblementeE {

    @Test
    public void testAddAndGetLast() {
        ListaDoblementeEncadenada<Integer> lista = new ListaDoblementeEncadenada<>();
        lista.add(5);
        lista.add(10);

        assertEquals(Integer.valueOf(10), lista.getLast());
        assertEquals(2, lista.size());
    }

    @Test
    public void testRemoveLast() {
        ListaDoblementeEncadenada<String> lista = new ListaDoblementeEncadenada<>();
        lista.add("X");
        lista.add("Y");

        String removed = lista.removeLast();

        assertEquals("Y", removed);
        assertEquals(1, lista.size());
    }

    @Test(expected = RuntimeException.class)
    public void testGetLastThrowsExceptionWhenEmpty() {
        ListaDoblementeEncadenada<Integer> lista = new ListaDoblementeEncadenada<>();
        lista.getLast();
    }
}