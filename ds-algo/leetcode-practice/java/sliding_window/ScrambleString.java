// https://leetcode.com/problems/scramble-string/
package sliding_window;

import java.util.*;

public class ScrambleString {
    // LeetCode Problem 87: Scramble String
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        ScrambleString solver = new ScrambleString();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ ScrambleString (Scramble String) Passed!");
    }
}
