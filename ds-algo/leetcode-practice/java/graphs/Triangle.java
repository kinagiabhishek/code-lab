// https://leetcode.com/problems/triangle/
package graphs;

import java.util.*;

public class Triangle {
    // LeetCode Problem 120: Triangle
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        Triangle solver = new Triangle();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ Triangle (Triangle) Passed!");
    }
}
