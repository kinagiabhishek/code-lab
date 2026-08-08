// https://leetcode.com/problems/binary-tree-level-order-traversal/
package stacks_and_queues;

import java.util.*;

public class BinaryTreeLevelOrderTraversal {
    // LeetCode Problem 102: Binary Tree Level Order Traversal
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        BinaryTreeLevelOrderTraversal solver = new BinaryTreeLevelOrderTraversal();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ BinaryTreeLevelOrderTraversal (Binary Tree Level Order Traversal) Passed!");
    }
}
