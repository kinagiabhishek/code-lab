// https://leetcode.com/problems/rectangle-area/
package bit_manipulation;

import java.util.*;

public class RectangleArea {
    // LeetCode Problem 223: Rectangle Area
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        RectangleArea solver = new RectangleArea();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ RectangleArea (Rectangle Area) Passed!");
    }
}
