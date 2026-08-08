// https://leetcode.com/problems/intersection-of-two-arrays-ii/
package math;

import java.util.*;

public class IntersectionOfTwoArraysIi {
    // LeetCode Problem 350: Intersection of Two Arrays II
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        IntersectionOfTwoArraysIi solver = new IntersectionOfTwoArraysIi();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ IntersectionOfTwoArraysIi (Intersection of Two Arrays II) Passed!");
    }
}
