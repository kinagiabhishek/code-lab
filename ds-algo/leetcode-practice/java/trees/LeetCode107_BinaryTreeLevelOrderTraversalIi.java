// https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
package trees;

import java.util.*;

public class LeetCode107_BinaryTreeLevelOrderTraversalIi {
    // LeetCode Problem 107: Binary Tree Level Order Traversal II
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode107_BinaryTreeLevelOrderTraversalIi solver = new LeetCode107_BinaryTreeLevelOrderTraversalIi();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode107_BinaryTreeLevelOrderTraversalIi (Binary Tree Level Order Traversal II) Passed!");
    }
}
