package mathematical.algorithms;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LCMTest {

    @Test
    public void testLCM() {
        LCM lcmCalculator = new LCM();

        // Test basic cases
        assertEquals(12, lcmCalculator.lcm(4, 6), "LCM of 4 and 6 should be 12");
        assertEquals(15, lcmCalculator.lcm(3, 5), "LCM of 3 and 5 should be 15");
        assertEquals(30, lcmCalculator.lcm(10, 15), "LCM of 10 and 15 should be 30");

        // Test case with one number being a multiple of the other
        assertEquals(20, lcmCalculator.lcm(20, 5), "LCM of 20 and 5 should be 20");
        assertEquals(20, lcmCalculator.lcm(5, 20), "LCM of 5 and 20 should be 20");

        // Test case with both numbers being the same
        assertEquals(10, lcmCalculator.lcm(10, 10), "LCM of 10 and 10 should be 10");

        // Test cases with prime numbers
        assertEquals(77, lcmCalculator.lcm(7, 11), "LCM of 7 and 11 should be 77");
        assertEquals(1, lcmCalculator.lcm(1, 1), "LCM of 1 and 1 should be 1");

        // Test case with zero (LCM involving zero is conventionally defined as zero)
        assertEquals(0, lcmCalculator.lcm(0, 5), "LCM of 0 and 5 should be 0");
        assertEquals(0, lcmCalculator.lcm(5, 0), "LCM of 5 and 0 should be 0");
        assertEquals(0, lcmCalculator.lcm(0, 0), "LCM of 0 and 0 should be 0");

        // Test with negative numbers (LCM should be positive)
        assertEquals(12, lcmCalculator.lcm(-4, 6), "LCM of -4 and 6 should be 12");
        assertEquals(30, lcmCalculator.lcm(-10, -15), "LCM of -10 and -15 should be 30");
    }
}

