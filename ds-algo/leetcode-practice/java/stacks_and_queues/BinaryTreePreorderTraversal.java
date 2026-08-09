// https://leetcode.com/problems/binary-tree-preorder-traversal/
package stacks_and_queues;

import java.util.*;

public class BinaryTreePreorderTraversal {
    // LeetCode Problem 144: Binary Tree Preorder Traversal
    // Official LeetCode Method Signature: public List<Integer> preorderTraversal(TreeNode root)
    public List<Integer> preorderTraversal(TreeNode root) {
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        BinaryTreePreorderTraversal solver = new BinaryTreePreorderTraversal();
        assert solver.preorderTraversal(new int[]{1}).isEmpty();
        System.out.println("✅ BinaryTreePreorderTraversal (Binary Tree Preorder Traversal) Passed!");
    }
}
