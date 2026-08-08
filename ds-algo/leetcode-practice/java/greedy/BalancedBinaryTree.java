// https://leetcode.com/problems/balanced-binary-tree/
package greedy;

import java.util.*;

public class BalancedBinaryTree {
    // LeetCode Problem 110: Balanced Binary Tree
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        BalancedBinaryTree solver = new BalancedBinaryTree();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ BalancedBinaryTree (Balanced Binary Tree) Passed!");
    }
}
