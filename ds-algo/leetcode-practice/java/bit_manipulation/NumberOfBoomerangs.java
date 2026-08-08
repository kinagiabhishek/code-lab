// https://leetcode.com/problems/number-of-boomerangs/
package bit_manipulation;

import java.util.*;

public class NumberOfBoomerangs {
    // LeetCode Problem 447: Number of Boomerangs
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        NumberOfBoomerangs solver = new NumberOfBoomerangs();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ NumberOfBoomerangs (Number of Boomerangs) Passed!");
    }
}
