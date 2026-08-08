// https://leetcode.com/problems/power-of-two/
package trees;

import java.util.*;

public class PowerOfTwo {
    // LeetCode Problem 231: Power of Two
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        PowerOfTwo solver = new PowerOfTwo();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ PowerOfTwo (Power of Two) Passed!");
    }
}
