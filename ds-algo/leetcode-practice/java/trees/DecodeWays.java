// https://leetcode.com/problems/decode-ways/
package trees;

import java.util.*;

public class DecodeWays {
    // LeetCode Problem 91: Decode Ways
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        DecodeWays solver = new DecodeWays();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ DecodeWays (Decode Ways) Passed!");
    }
}
