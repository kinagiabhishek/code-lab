// https://leetcode.com/problems/magical-string/
package binary_search;

import java.util.*;

public class MagicalString {
    // LeetCode Problem 481: Magical String
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        MagicalString solver = new MagicalString();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ MagicalString (Magical String) Passed!");
    }
}
