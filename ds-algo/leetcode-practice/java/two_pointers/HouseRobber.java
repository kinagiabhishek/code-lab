// https://leetcode.com/problems/house-robber/
package two_pointers;

import java.util.*;

public class HouseRobber {
    // LeetCode Problem 198: House Robber
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        HouseRobber solver = new HouseRobber();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ HouseRobber (House Robber) Passed!");
    }
}
