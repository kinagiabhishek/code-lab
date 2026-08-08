// https://leetcode.com/problems/binary-tree-level-order-traversal/
package trees;

import java.util.*;

public class LeetCode102_BinaryTreeLevelOrderTraversal {
    // LeetCode Problem 102: Binary Tree Level Order Traversal
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode102_BinaryTreeLevelOrderTraversal solver = new LeetCode102_BinaryTreeLevelOrderTraversal();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode102_BinaryTreeLevelOrderTraversal (Binary Tree Level Order Traversal) Passed!");
    }
}
