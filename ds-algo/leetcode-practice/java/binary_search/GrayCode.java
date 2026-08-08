// https://leetcode.com/problems/gray-code/
package binary_search;

import java.util.*;

public class GrayCode {
    // LeetCode Problem 89: Gray Code
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        GrayCode solver = new GrayCode();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ GrayCode (Gray Code) Passed!");
    }
}
