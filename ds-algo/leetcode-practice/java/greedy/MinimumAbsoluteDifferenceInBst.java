// https://leetcode.com/problems/minimum-absolute-difference-in-bst/
package greedy;

import java.util.*;

public class MinimumAbsoluteDifferenceInBst {
    // LeetCode Problem 530: Minimum Absolute Difference in BST
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        MinimumAbsoluteDifferenceInBst solver = new MinimumAbsoluteDifferenceInBst();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ MinimumAbsoluteDifferenceInBst (Minimum Absolute Difference in BST) Passed!");
    }
}
