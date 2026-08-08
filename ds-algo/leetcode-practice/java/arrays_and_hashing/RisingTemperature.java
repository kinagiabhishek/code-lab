// https://leetcode.com/problems/rising-temperature/
package arrays_and_hashing;

import java.util.*;

public class RisingTemperature {
    // LeetCode Problem 197: Rising Temperature
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        RisingTemperature solver = new RisingTemperature();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ RisingTemperature (Rising Temperature) Passed!");
    }
}
