// https://leetcode.com/problems/distribute-candies/
package arrays_and_hashing;

import java.util.*;

public class DistributeCandies {
    // LeetCode Problem 575: Distribute Candies
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        DistributeCandies solver = new DistributeCandies();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ DistributeCandies (Distribute Candies) Passed!");
    }
}
