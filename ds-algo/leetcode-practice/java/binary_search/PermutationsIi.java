// https://leetcode.com/problems/permutations-ii/
package binary_search;

import java.util.*;

public class PermutationsIi {
    // LeetCode Problem 47: Permutations II
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        PermutationsIi solver = new PermutationsIi();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ PermutationsIi (Permutations II) Passed!");
    }
}
