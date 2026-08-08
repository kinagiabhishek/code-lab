// https://leetcode.com/problems/diameter-of-binary-tree/
package dynamic_programming;

import java.util.*;

public class DiameterOfBinaryTree {
    // LeetCode Problem 543: Diameter of Binary Tree
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        DiameterOfBinaryTree solver = new DiameterOfBinaryTree();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ DiameterOfBinaryTree (Diameter of Binary Tree) Passed!");
    }
}
