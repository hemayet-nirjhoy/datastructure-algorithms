package arrays.hashing;

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {
    /***
     *
     Topics
     Companies
     Hint
     There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.

     Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.

     Note that multiple kids can have the greatest number of candies.

     Input: candies = [2,3,5,1,3], extraCandies = 3
     Output: [true,true,true,false,true]
     */



    /**
     Approach 01: find the maximum number of the array. Then compare this with extra number in another loop. Time complexity O(n+n)
     */
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> output = new ArrayList<>();
        int max = candies[0];
        for(int temp: candies){
            if (max < temp)
                max = temp;
        }
        for (int temp: candies){
            output.add(temp + extraCandies >= max);
        }
        return output;
    }
}
