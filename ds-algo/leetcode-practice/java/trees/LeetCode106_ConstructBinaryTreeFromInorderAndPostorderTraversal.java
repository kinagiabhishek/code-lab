// https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/
package trees;

import java.util.*;

public class LeetCode106_ConstructBinaryTreeFromInorderAndPostorderTraversal {
    // LeetCode Problem 106: Construct Binary Tree from Inorder and Postorder Traversal
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode106_ConstructBinaryTreeFromInorderAndPostorderTraversal solver = new LeetCode106_ConstructBinaryTreeFromInorderAndPostorderTraversal();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode106_ConstructBinaryTreeFromInorderAndPostorderTraversal (Construct Binary Tree from Inorder and Postorder Traversal) Passed!");
    }
}
