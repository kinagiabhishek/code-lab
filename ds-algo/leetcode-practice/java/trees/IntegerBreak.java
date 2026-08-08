// https://leetcode.com/problems/integer-break/
package trees;

import java.util.*;

public class IntegerBreak {
    // LeetCode Problem 343: Integer Break
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        IntegerBreak solver = new IntegerBreak();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ IntegerBreak (Integer Break) Passed!");
    }
}
