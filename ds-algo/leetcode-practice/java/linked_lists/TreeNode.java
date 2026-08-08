// https://leetcode.com/problems/tree-node/
package linked_lists;

import java.util.*;

public class TreeNode {
    // LeetCode Problem 608: Tree Node
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        TreeNode solver = new TreeNode();
        TreeNode root = new TreeNode(1); root.left = new TreeNode(2);
        assert solver.maxDepth(root) == 2;
        System.out.println("✅ TreeNode Passed!");
    }
}
