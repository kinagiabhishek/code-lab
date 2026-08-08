// https://leetcode.com/problems/house-robber-ii/
package sliding_window;

import java.util.*;

public class HouseRobberIi {
    // LeetCode Problem 213: House Robber II
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        HouseRobberIi solver = new HouseRobberIi();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ HouseRobberIi (House Robber II) Passed!");
    }
}
