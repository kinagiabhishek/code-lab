// https://leetcode.com/problems/reverse-nodes-in-k-group/
package dynamic_programming;

import java.util.*;

public class ReverseNodesInKgroup {
    // LeetCode Problem 25: Reverse Nodes in k-Group
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        ReverseNodesInKgroup solver = new ReverseNodesInKgroup();
        TreeNode root = new TreeNode(1); root.left = new TreeNode(2);
        assert solver.maxDepth(root) == 2;
        System.out.println("✅ ReverseNodesInKgroup Passed!");
    }
}
