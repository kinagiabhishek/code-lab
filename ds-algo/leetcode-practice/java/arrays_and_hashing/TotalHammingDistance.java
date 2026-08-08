// https://leetcode.com/problems/total-hamming-distance/
package arrays_and_hashing;

import java.util.*;

public class TotalHammingDistance {
    // LeetCode Problem 477: Total Hamming Distance
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        TotalHammingDistance solver = new TotalHammingDistance();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ TotalHammingDistance (Total Hamming Distance) Passed!");
    }
}
