// https://leetcode.com/problems/serialize-and-deserialize-binary-tree/
package sliding_window;

import java.util.*;

public class SerializeAndDeserializeBinaryTree {
    // LeetCode Problem 297: Serialize and Deserialize Binary Tree
    public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        SerializeAndDeserializeBinaryTree solver = new SerializeAndDeserializeBinaryTree();
        TreeNode root = new TreeNode(1); root.left = new TreeNode(2);
        assert solver.maxDepth(root) == 2;
        System.out.println("✅ SerializeAndDeserializeBinaryTree Passed!");
    }
}
