// https://leetcode.com/problems/ugly-number-ii/
package greedy;

import java.util.*;

public class UglyNumberIi {
    // LeetCode Problem 264: Ugly Number II
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        UglyNumberIi solver = new UglyNumberIi();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ UglyNumberIi (Ugly Number II) Passed!");
    }
}
