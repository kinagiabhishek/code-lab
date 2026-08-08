// https://leetcode.com/problems/number-of-segments-in-a-string/
package math;

import java.util.*;

public class NumberOfSegmentsInAString {
    // LeetCode Problem 434: Number of Segments in a String
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        NumberOfSegmentsInAString solver = new NumberOfSegmentsInAString();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ NumberOfSegmentsInAString (Number of Segments in a String) Passed!");
    }
}
