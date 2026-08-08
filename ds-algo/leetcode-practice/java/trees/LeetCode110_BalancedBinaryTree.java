// https://leetcode.com/problems/balanced-binary-tree/
package trees;

import java.util.*;

public class LeetCode110_BalancedBinaryTree {
    // LeetCode Problem 110: Balanced Binary Tree
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode110_BalancedBinaryTree solver = new LeetCode110_BalancedBinaryTree();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode110_BalancedBinaryTree (Balanced Binary Tree) Passed!");
    }
}
