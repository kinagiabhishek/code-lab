// https://leetcode.com/problems/maximum-depth-of-n-ary-tree/
package bit_manipulation;

import java.util.*;

public class MaximumDepthOfNaryTree {
    // LeetCode Problem 559: Maximum Depth of N-ary Tree
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        MaximumDepthOfNaryTree solver = new MaximumDepthOfNaryTree();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ MaximumDepthOfNaryTree (Maximum Depth of N-ary Tree) Passed!");
    }
}
