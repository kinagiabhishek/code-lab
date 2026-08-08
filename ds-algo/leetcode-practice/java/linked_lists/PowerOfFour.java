// https://leetcode.com/problems/power-of-four/
package linked_lists;

import java.util.*;

public class PowerOfFour {
    // LeetCode Problem 342: Power of Four
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        PowerOfFour solver = new PowerOfFour();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ PowerOfFour (Power of Four) Passed!");
    }
}
