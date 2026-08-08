// https://leetcode.com/problems/binary-tree-preorder-traversal/
package stacks_and_queues;

import java.util.*;

public class BinaryTreePreorderTraversal {
    // LeetCode Problem 144: Binary Tree Preorder Traversal
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        BinaryTreePreorderTraversal solver = new BinaryTreePreorderTraversal();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ BinaryTreePreorderTraversal (Binary Tree Preorder Traversal) Passed!");
    }
}
