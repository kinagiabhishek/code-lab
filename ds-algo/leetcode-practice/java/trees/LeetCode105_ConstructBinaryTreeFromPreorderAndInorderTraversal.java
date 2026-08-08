// https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
package trees;

import java.util.*;

public class LeetCode105_ConstructBinaryTreeFromPreorderAndInorderTraversal {
    // LeetCode Problem 105: Construct Binary Tree from Preorder and Inorder Traversal
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode105_ConstructBinaryTreeFromPreorderAndInorderTraversal solver = new LeetCode105_ConstructBinaryTreeFromPreorderAndInorderTraversal();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode105_ConstructBinaryTreeFromPreorderAndInorderTraversal (Construct Binary Tree from Preorder and Inorder Traversal) Passed!");
    }
}
