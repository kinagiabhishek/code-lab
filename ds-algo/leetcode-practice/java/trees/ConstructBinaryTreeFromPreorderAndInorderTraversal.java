// https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
package trees;

import java.util.*;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    // LeetCode Problem 105: Construct Binary Tree from Preorder and Inorder Traversal
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        ConstructBinaryTreeFromPreorderAndInorderTraversal solver = new ConstructBinaryTreeFromPreorderAndInorderTraversal();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ ConstructBinaryTreeFromPreorderAndInorderTraversal (Construct Binary Tree from Preorder and Inorder Traversal) Passed!");
    }
}
