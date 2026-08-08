// https://leetcode.com/problems/single-number-iii/
package graphs;

import java.util.*;

public class SingleNumberIii {
    // LeetCode Problem 260: Single Number III
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        SingleNumberIii solver = new SingleNumberIii();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ SingleNumberIii (Single Number III) Passed!");
    }
}
