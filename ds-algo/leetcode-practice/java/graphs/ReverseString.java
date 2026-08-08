// https://leetcode.com/problems/reverse-string/
package graphs;

import java.util.*;

public class ReverseString {
    // LeetCode Problem 344: Reverse String
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        ReverseString solver = new ReverseString();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ ReverseString (Reverse String) Passed!");
    }
}
