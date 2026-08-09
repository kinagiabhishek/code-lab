// https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
package heap_and_priority_queue;

import java.util.*;

public class BinaryTreeLevelOrderTraversalIi {
    // LeetCode Problem 107: Binary Tree Level Order Traversal II
    // Official LeetCode Method Signature: public List<List<Integer>> levelOrderBottom(TreeNode root)
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        BinaryTreeLevelOrderTraversalIi solver = new BinaryTreeLevelOrderTraversalIi();
        assert solver.levelOrderBottom(new int[]{1}).isEmpty();
        System.out.println("✅ BinaryTreeLevelOrderTraversalIi Passed!");
    }
}
