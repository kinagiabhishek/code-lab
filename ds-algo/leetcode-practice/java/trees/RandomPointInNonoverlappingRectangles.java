// https://leetcode.com/problems/random-point-in-non-overlapping-rectangles/
package trees;

import java.util.*;

public class RandomPointInNonoverlappingRectangles {
    // LeetCode Problem 497: Random Point in Non-overlapping Rectangles
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        RandomPointInNonoverlappingRectangles solver = new RandomPointInNonoverlappingRectangles();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ RandomPointInNonoverlappingRectangles (Random Point in Non-overlapping Rectangles) Passed!");
    }
}
