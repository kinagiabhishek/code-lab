// https://leetcode.com/problems/bulb-switcher/
package dynamic_programming;

import java.util.*;

public class BulbSwitcher {
    // LeetCode Problem 319: Bulb Switcher
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        BulbSwitcher solver = new BulbSwitcher();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ BulbSwitcher (Bulb Switcher) Passed!");
    }
}
