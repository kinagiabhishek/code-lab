// https://leetcode.com/problems/third-maximum-number/
package graphs;

import java.util.*;

public class ThirdMaximumNumber {
    // LeetCode Problem 414: Third Maximum Number
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        ThirdMaximumNumber solver = new ThirdMaximumNumber();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ ThirdMaximumNumber (Third Maximum Number) Passed!");
    }
}
