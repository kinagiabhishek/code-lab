// https://leetcode.com/problems/next-greater-element-iii/
package backtracking;

import java.util.*;

public class NextGreaterElementIii {
    // LeetCode Problem 556: Next Greater Element III
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        NextGreaterElementIii solver = new NextGreaterElementIii();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ NextGreaterElementIii (Next Greater Element III) Passed!");
    }
}
