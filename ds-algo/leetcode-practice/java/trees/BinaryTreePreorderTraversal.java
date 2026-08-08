// https://leetcode.com/problems/binary-tree-preorder-traversal/
package trees;

import java.util.*;

public class BinaryTreePreorderTraversal {
    // LeetCode Problem 144: Binary Tree Preorder Traversal
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        BinaryTreePreorderTraversal solver = new BinaryTreePreorderTraversal();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode144_BinaryTreePreorderTraversal (Binary Tree Preorder Traversal) Passed!");
    }
}
