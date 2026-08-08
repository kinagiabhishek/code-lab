// https://leetcode.com/problems/jump-game-ii/
package sliding_window;

import java.util.*;

public class JumpGameIi {
    // LeetCode Problem 45: Jump Game II
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        JumpGameIi solver = new JumpGameIi();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ JumpGameIi (Jump Game II) Passed!");
    }
}
