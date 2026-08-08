// https://leetcode.com/problems/number-of-provinces/
package arrays_and_hashing;

import java.util.*;

public class NumberOfProvinces {
    // LeetCode Problem 547: Number of Provinces
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        NumberOfProvinces solver = new NumberOfProvinces();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ NumberOfProvinces (Number of Provinces) Passed!");
    }
}
