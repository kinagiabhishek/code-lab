// https://leetcode.com/problems/binary-tree-inorder-traversal/
package trees;

import java.util.*;

public class BinaryTreeInorderTraversal {
public static class TreeNode { int val; TreeNode left, right; TreeNode(int val) { this.val = val; } }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }
    private void helper(TreeNode node, List<Integer> res) {
        if (node == null) return;
        helper(node.left, res);
        res.add(node.val);
        helper(node.right, res);
    }
    public static void main(String[] args) {
        BinaryTreeInorderTraversal solver = new BinaryTreeInorderTraversal();
        TreeNode root = new TreeNode(1); root.right = new TreeNode(2); root.right.left = new TreeNode(3);
        assert solver.inorderTraversal(root).equals(Arrays.asList(1, 3, 2));
        System.out.println("✅ BinaryTreeInorderTraversal Passed!");
    }
}
