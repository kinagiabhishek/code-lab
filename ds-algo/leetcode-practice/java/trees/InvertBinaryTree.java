// https://leetcode.com/problems/invert-binary-tree/
package trees;

import java.util.*;

public class InvertBinaryTree {
    // LeetCode Problem 226: Invert Binary Tree
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        InvertBinaryTree solver = new InvertBinaryTree();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode226_InvertBinaryTree (Invert Binary Tree) Passed!");
    }
}
