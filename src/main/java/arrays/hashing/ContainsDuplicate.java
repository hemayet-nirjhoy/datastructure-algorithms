package arrays.hashing;

import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate {

    /**
     * Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.
     * @return true
     */
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}
