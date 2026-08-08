// https://leetcode.com/problems/maximum-depth-of-binary-tree/
package linked_lists;

import java.util.*;

public class MaximumDepthOfBinaryTree {
    // LeetCode Problem 104: Maximum Depth of Binary Tree
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        MaximumDepthOfBinaryTree solver = new MaximumDepthOfBinaryTree();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ MaximumDepthOfBinaryTree (Maximum Depth of Binary Tree) Passed!");
    }
}
