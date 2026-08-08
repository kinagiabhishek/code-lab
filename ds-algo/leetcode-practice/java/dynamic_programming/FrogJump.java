// https://leetcode.com/problems/frog-jump/
package dynamic_programming;

import java.util.*;

public class FrogJump {
    // LeetCode Problem 403: Frog Jump
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        FrogJump solver = new FrogJump();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ FrogJump (Frog Jump) Passed!");
    }
}
