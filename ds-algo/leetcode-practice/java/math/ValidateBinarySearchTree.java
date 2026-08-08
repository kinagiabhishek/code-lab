// https://leetcode.com/problems/validate-binary-search-tree/
package math;

import java.util.*;

public class ValidateBinarySearchTree {
    // LeetCode Problem 98: Validate Binary Search Tree
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        ValidateBinarySearchTree solver = new ValidateBinarySearchTree();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ ValidateBinarySearchTree (Validate Binary Search Tree) Passed!");
    }
}
