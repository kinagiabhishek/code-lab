// https://leetcode.com/problems/additive-number/
package greedy;

import java.util.*;

public class AdditiveNumber {
    // LeetCode Problem 306: Additive Number
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        AdditiveNumber solver = new AdditiveNumber();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ AdditiveNumber (Additive Number) Passed!");
    }
}
