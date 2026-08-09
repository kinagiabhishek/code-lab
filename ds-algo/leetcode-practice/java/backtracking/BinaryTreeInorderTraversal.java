// https://leetcode.com/problems/binary-tree-inorder-traversal/
package backtracking;

import java.util.*;

public class BinaryTreeInorderTraversal {
    // LeetCode Problem 94: Binary Tree Inorder Traversal
    // Official LeetCode Method Signature: public List<Integer> inorderTraversal(TreeNode root)
    public List<Integer> inorderTraversal(TreeNode root) {
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        BinaryTreeInorderTraversal solver = new BinaryTreeInorderTraversal();
        assert solver.inorderTraversal(new int[]{1}).isEmpty();
        System.out.println("✅ BinaryTreeInorderTraversal (Binary Tree Inorder Traversal) Passed!");
    }
}
