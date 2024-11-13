package arrays.hashing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class KidsWithCandiesTest {

    private final KidsWithCandies solution = new KidsWithCandies();

    @Test
    void testExampleCase() {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        List<Boolean> expected = List.of(true, true, true, false, true);
        assertEquals(expected, solution.kidsWithCandies(candies, extraCandies));
    }

    @Test
    void testAllKidsAlreadyHaveMaxCandies() {
        int[] candies = {5, 5, 5, 5, 5};
        int extraCandies = 3;
        List<Boolean> expected = List.of(true, true, true, true, true);
        assertEquals(expected, solution.kidsWithCandies(candies, extraCandies));
    }

    @Test
    void testExtraCandiesIsZero() {
        int[] candies = {1, 2, 3, 4, 5};
        int extraCandies = 0;
        List<Boolean> expected = List.of(false, false, false, false, true);
        assertEquals(expected, solution.kidsWithCandies(candies, extraCandies));
    }

    @Test
    void testSingleKid() {
        int[] candies = {10};
        int extraCandies = 5;
        List<Boolean> expected = List.of(true);
        assertEquals(expected, solution.kidsWithCandies(candies, extraCandies));
    }

    @Test
    void testNoKidCanReachMaxWithExtraCandies() {
        int[] candies = {1, 2, 3, 4};
        int extraCandies = 1;
        List<Boolean> expected = List.of(false, false, false, true);
        assertEquals(expected, solution.kidsWithCandies(candies, extraCandies));
    }
}
