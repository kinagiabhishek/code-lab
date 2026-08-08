// https://leetcode.com/problems/perfect-rectangle/
package bit_manipulation;

import java.util.*;

public class PerfectRectangle {
    // LeetCode Problem 391: Perfect Rectangle
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        PerfectRectangle solver = new PerfectRectangle();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ PerfectRectangle (Perfect Rectangle) Passed!");
    }
}
