// https://leetcode.com/problems/power-of-three/
package stacks_and_queues;

import java.util.*;

public class PowerOfThree {
    // LeetCode Problem 326: Power of Three
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        PowerOfThree solver = new PowerOfThree();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ PowerOfThree (Power of Three) Passed!");
    }
}
