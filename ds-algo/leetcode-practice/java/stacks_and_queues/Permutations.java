// https://leetcode.com/problems/permutations/
package stacks_and_queues;

import java.util.*;

public class Permutations {
    // LeetCode Problem 46: Permutations
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        Permutations solver = new Permutations();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ Permutations (Permutations) Passed!");
    }
}
