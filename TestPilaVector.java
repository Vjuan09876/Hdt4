import org.junit.Test;
import static org.junit.Assert.*;

public class TestPilaVector {

    @Test
    public void testPushAndPop() {
        PilaVector<String> pila = new PilaVector<>();
        pila.push("A");
        pila.push("B");

        assertEquals("B", pila.pop());
        assertEquals(1, pila.size());
    }

    @Test
    public void testEstaVacia() {
        PilaVector<Integer> pila = new PilaVector<>();
        assertTrue(pila.estaVacia());

        pila.push(100);
        assertFalse(pila.estaVacia());
    }
}