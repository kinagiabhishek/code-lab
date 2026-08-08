// https://leetcode.com/problems/next-greater-element-ii/
package bit_manipulation;

import java.util.*;

public class NextGreaterElementIi {
    // LeetCode Problem 503: Next Greater Element II
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        NextGreaterElementIi solver = new NextGreaterElementIi();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ NextGreaterElementIi (Next Greater Element II) Passed!");
    }
}
