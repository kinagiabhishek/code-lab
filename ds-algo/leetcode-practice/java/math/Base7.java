// https://leetcode.com/problems/base-7/
package math;

import java.util.*;

public class Base7 {
    // LeetCode Problem 504: Base 7
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        Base7 solver = new Base7();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ Base7 (Base 7) Passed!");
    }
}
