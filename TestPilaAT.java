import org.junit.Test;
import static org.junit.Assert.*;

public class TestPilaAT {

    @Test
    public void testPushAndPeek() {
        PilaArrayList<Integer> pila = new PilaArrayList<>();
        pila.push(10);
        pila.push(20);

        assertEquals(Integer.valueOf(20), pila.peek());
        assertEquals(2, pila.size());
    }

    @Test
    public void testPop() {
        PilaArrayList<Integer> pila = new PilaArrayList<>();
        pila.push(1);
        pila.push(2);

        Integer value = pila.pop();

        assertEquals(Integer.valueOf(2), value);
        assertEquals(1, pila.size());
    }

    @Test
    public void testPopWhenEmptyReturnsNull() {
        PilaArrayList<Integer> pila = new PilaArrayList<>();

        assertNull(pila.pop());
        assertNull(pila.peek());
    }
}