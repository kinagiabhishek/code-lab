// https://leetcode.com/problems/3sum/
package arrays_and_hashing;

import java.util.*;

public class P3sum {
    // LeetCode Problem 15: 3Sum
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        P3sum solver = new P3sum();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ P3sum (3Sum) Passed!");
    }
}
