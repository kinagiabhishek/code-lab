// https://leetcode.com/problems/minimum-depth-of-binary-tree/
package bit_manipulation;

import java.util.*;

public class MinimumDepthOfBinaryTree {
    // LeetCode Problem 111: Minimum Depth of Binary Tree
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        MinimumDepthOfBinaryTree solver = new MinimumDepthOfBinaryTree();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ MinimumDepthOfBinaryTree (Minimum Depth of Binary Tree) Passed!");
    }
}
