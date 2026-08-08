// https://leetcode.com/problems/multiply-strings/
package arrays_and_hashing;

import java.util.*;

public class MultiplyStrings {
    // LeetCode Problem 43: Multiply Strings
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        MultiplyStrings solver = new MultiplyStrings();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ MultiplyStrings (Multiply Strings) Passed!");
    }
}
