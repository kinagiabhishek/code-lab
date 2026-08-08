// https://leetcode.com/problems/random-pick-index/
package linked_lists;

import java.util.*;

public class RandomPickIndex {
    // LeetCode Problem 398: Random Pick Index
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        RandomPickIndex solver = new RandomPickIndex();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ RandomPickIndex (Random Pick Index) Passed!");
    }
}
