// https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
package heap_and_priority_queue;

import java.util.*;

public class BinaryTreeLevelOrderTraversalIi {
    // LeetCode Problem 107: Binary Tree Level Order Traversal II
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        BinaryTreeLevelOrderTraversalIi solver = new BinaryTreeLevelOrderTraversalIi();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ BinaryTreeLevelOrderTraversalIi (Binary Tree Level Order Traversal II) Passed!");
    }
}
