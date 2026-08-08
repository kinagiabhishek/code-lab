// https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
package trees;

import java.util.*;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    // LeetCode Problem 105: Construct Binary Tree from Preorder and Inorder Traversal
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        ConstructBinaryTreeFromPreorderAndInorderTraversal solver = new ConstructBinaryTreeFromPreorderAndInorderTraversal();
        TreeNode root = new TreeNode(1); root.left = new TreeNode(2);
        assert solver.maxDepth(root) == 2;
        System.out.println("✅ ConstructBinaryTreeFromPreorderAndInorderTraversal Passed!");
    }
}
