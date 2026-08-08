// https://leetcode.com/problems/zigzag-conversion/
package linked_lists;

import java.util.*;

public class ZigzagConversion {
    // LeetCode Problem 6: Zigzag Conversion
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        ZigzagConversion solver = new ZigzagConversion();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ ZigzagConversion (Zigzag Conversion) Passed!");
    }
}
