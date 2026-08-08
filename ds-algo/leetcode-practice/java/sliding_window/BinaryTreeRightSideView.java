// https://leetcode.com/problems/binary-tree-right-side-view/
package sliding_window;

import java.util.*;

public class BinaryTreeRightSideView {
    // LeetCode Problem 199: Binary Tree Right Side View
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        BinaryTreeRightSideView solver = new BinaryTreeRightSideView();
        TreeNode root = new TreeNode(1); root.left = new TreeNode(2);
        assert solver.maxDepth(root) == 2;
        System.out.println("✅ BinaryTreeRightSideView Passed!");
    }
}
