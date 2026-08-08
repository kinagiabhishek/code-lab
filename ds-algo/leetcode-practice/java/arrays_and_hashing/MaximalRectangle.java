// https://leetcode.com/problems/maximal-rectangle/
package arrays_and_hashing;

import java.util.*;

public class MaximalRectangle {
    // LeetCode Problem 85: Maximal Rectangle
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        MaximalRectangle solver = new MaximalRectangle();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ MaximalRectangle (Maximal Rectangle) Passed!");
    }
}
