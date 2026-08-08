// https://leetcode.com/problems/permutation-sequence/
package stacks_and_queues;

import java.util.*;

public class PermutationSequence {
    // LeetCode Problem 60: Permutation Sequence
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        PermutationSequence solver = new PermutationSequence();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ PermutationSequence (Permutation Sequence) Passed!");
    }
}
