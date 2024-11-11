package mathematical.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GCDTest {

    @Test
    public void testGcdIterative() {
        assertEquals(6, GCD.gcd(54, 24), "GCD of 54 and 24 should be 6");
        assertEquals(1, GCD.gcd(17, 13), "GCD of 17 and 13 should be 1");
        assertEquals(10, GCD.gcd(10, 10), "GCD of 10 and 10 should be 10");
        assertEquals(5, GCD.gcd(20, 5), "GCD of 20 and 5 should be 5");
        assertEquals(12, GCD.gcd(48, 180), "GCD of 48 and 180 should be 12");
    }

    @Test
    public void testGcdRecursive() {
        assertEquals(6, GCD.gcdRec(54, 24), "GCD of 54 and 24 should be 6");
        assertEquals(1, GCD.gcdRec(17, 13), "GCD of 17 and 13 should be 1");
        assertEquals(10, GCD.gcdRec(10, 10), "GCD of 10 and 10 should be 10");
        assertEquals(5, GCD.gcdRec(20, 5), "GCD of 20 and 5 should be 5");
        assertEquals(12, GCD.gcdRec(48, 180), "GCD of 48 and 180 should be 12");
    }
}
