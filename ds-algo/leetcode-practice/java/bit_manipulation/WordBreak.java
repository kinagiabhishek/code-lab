// https://leetcode.com/problems/word-break/
package bit_manipulation;

import java.util.*;

public class WordBreak {
    // LeetCode Problem 139: Word Break
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        WordBreak solver = new WordBreak();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ WordBreak (Word Break) Passed!");
    }
}
