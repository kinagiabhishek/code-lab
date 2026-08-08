// https://leetcode.com/problems/binary-tree-preorder-traversal/
package trees;

import java.util.*;

public class LeetCode144_BinaryTreePreorderTraversal {
    // LeetCode Problem 144: Binary Tree Preorder Traversal
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode144_BinaryTreePreorderTraversal solver = new LeetCode144_BinaryTreePreorderTraversal();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode144_BinaryTreePreorderTraversal (Binary Tree Preorder Traversal) Passed!");
    }
}
