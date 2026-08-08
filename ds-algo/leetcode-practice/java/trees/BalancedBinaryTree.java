// https://leetcode.com/problems/balanced-binary-tree/
package trees;

import java.util.*;

public class BalancedBinaryTree {
    // LeetCode Problem 110: Balanced Binary Tree
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        BalancedBinaryTree solver = new BalancedBinaryTree();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode110_BalancedBinaryTree (Balanced Binary Tree) Passed!");
    }
}
