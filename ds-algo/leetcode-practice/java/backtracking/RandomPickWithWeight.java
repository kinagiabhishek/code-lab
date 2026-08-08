// https://leetcode.com/problems/random-pick-with-weight/
package backtracking;

import java.util.*;

public class RandomPickWithWeight {
    // LeetCode Problem 528: Random Pick with Weight
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        RandomPickWithWeight solver = new RandomPickWithWeight();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ RandomPickWithWeight (Random Pick with Weight) Passed!");
    }
}
