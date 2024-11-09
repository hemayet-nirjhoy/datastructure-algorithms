package arrays.hashing;

import arrays.hashing.ContainsDuplicate;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ContainsDuplicateTest {

    @Test
    void testContainsDuplicateWithDuplicates() {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int[] nums = {1, 2, 3, 1};
        boolean result = containsDuplicate.containsDuplicate(nums);
        assertThat(result).isTrue();
    }

    @Test
    void testContainsDuplicateWithoutDuplicates() {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int[] nums = {1, 2, 3, 4};
        boolean result = containsDuplicate.containsDuplicate(nums);
        assertThat(result).isFalse();
    }

    @Test
    void testContainsDuplicateWithEmptyArray() {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int[] nums = {};
        boolean result = containsDuplicate.containsDuplicate(nums);
        assertThat(result).isFalse();
    }

    @Test
    void testContainsDuplicateWithSingleElement() {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int[] nums = {42};
        boolean result = containsDuplicate.containsDuplicate(nums);
        assertThat(result).isFalse();
    }

    @Test
    void testContainsDuplicateWithNegativeNumbers() {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int[] nums = {-1, -2, -3, -1};
        boolean result = containsDuplicate.containsDuplicate(nums);
        assertThat(result).isTrue();
    }

    @Test
    void testContainsDuplicateWithLargeArray() {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int[] nums = new int[10000];
        for (int i = 0; i < 9999; i++) {
            nums[i] = i;
        }
        nums[9999] = 9998;  // Duplicate value
        boolean result = containsDuplicate.containsDuplicate(nums);
        assertThat(result).isTrue();
    }
}
