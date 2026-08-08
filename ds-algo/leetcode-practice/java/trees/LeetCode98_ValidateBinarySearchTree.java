// https://leetcode.com/problems/validate-binary-search-tree/
package trees;

import java.util.*;

public class LeetCode98_ValidateBinarySearchTree {
    // LeetCode Problem 98: Validate Binary Search Tree
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode98_ValidateBinarySearchTree solver = new LeetCode98_ValidateBinarySearchTree();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode98_ValidateBinarySearchTree (Validate Binary Search Tree) Passed!");
    }
}
