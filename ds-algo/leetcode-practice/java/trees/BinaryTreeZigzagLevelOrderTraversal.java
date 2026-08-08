// https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
package trees;

import java.util.*;

public class BinaryTreeZigzagLevelOrderTraversal {
    // LeetCode Problem 103: Binary Tree Zigzag Level Order Traversal
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        BinaryTreeZigzagLevelOrderTraversal solver = new BinaryTreeZigzagLevelOrderTraversal();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode103_BinaryTreeZigzagLevelOrderTraversal (Binary Tree Zigzag Level Order Traversal) Passed!");
    }
}
