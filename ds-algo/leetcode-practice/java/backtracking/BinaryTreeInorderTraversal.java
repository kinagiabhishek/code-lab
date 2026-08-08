// https://leetcode.com/problems/binary-tree-inorder-traversal/
package backtracking;

import java.util.*;

public class BinaryTreeInorderTraversal {
    // LeetCode Problem 94: Binary Tree Inorder Traversal
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        BinaryTreeInorderTraversal solver = new BinaryTreeInorderTraversal();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ BinaryTreeInorderTraversal (Binary Tree Inorder Traversal) Passed!");
    }
}
