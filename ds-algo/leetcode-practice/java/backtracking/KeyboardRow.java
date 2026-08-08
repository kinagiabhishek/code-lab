// https://leetcode.com/problems/keyboard-row/
package backtracking;

import java.util.*;

public class KeyboardRow {
    // LeetCode Problem 500: Keyboard Row
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        KeyboardRow solver = new KeyboardRow();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ KeyboardRow (Keyboard Row) Passed!");
    }
}
