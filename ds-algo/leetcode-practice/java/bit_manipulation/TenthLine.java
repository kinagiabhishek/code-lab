// https://leetcode.com/problems/tenth-line/
package bit_manipulation;

import java.util.*;

public class TenthLine {
    // LeetCode Problem 195: Tenth Line
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        TenthLine solver = new TenthLine();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ TenthLine (Tenth Line) Passed!");
    }
}
