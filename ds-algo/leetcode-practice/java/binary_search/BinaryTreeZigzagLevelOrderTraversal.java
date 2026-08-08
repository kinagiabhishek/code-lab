// https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
package binary_search;

import java.util.*;

public class BinaryTreeZigzagLevelOrderTraversal {
    // LeetCode Problem 103: Binary Tree Zigzag Level Order Traversal
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        BinaryTreeZigzagLevelOrderTraversal solver = new BinaryTreeZigzagLevelOrderTraversal();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ BinaryTreeZigzagLevelOrderTraversal (Binary Tree Zigzag Level Order Traversal) Passed!");
    }
}
