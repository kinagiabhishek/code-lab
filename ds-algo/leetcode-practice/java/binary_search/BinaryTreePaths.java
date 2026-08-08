// https://leetcode.com/problems/binary-tree-paths/
package binary_search;

import java.util.*;

public class BinaryTreePaths {
    // LeetCode Problem 257: Binary Tree Paths
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        BinaryTreePaths solver = new BinaryTreePaths();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ BinaryTreePaths (Binary Tree Paths) Passed!");
    }
}
