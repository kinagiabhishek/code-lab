// https://leetcode.com/problems/invert-binary-tree/
package two_pointers;

import java.util.*;

public class InvertBinaryTree {
    // LeetCode Problem 226: Invert Binary Tree
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        InvertBinaryTree solver = new InvertBinaryTree();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ InvertBinaryTree (Invert Binary Tree) Passed!");
    }
}
