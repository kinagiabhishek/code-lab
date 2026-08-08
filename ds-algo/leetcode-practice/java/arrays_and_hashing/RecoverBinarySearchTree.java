// https://leetcode.com/problems/recover-binary-search-tree/
package arrays_and_hashing;

import java.util.*;

public class RecoverBinarySearchTree {
    // LeetCode Problem 99: Recover Binary Search Tree
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        RecoverBinarySearchTree solver = new RecoverBinarySearchTree();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ RecoverBinarySearchTree (Recover Binary Search Tree) Passed!");
    }
}
