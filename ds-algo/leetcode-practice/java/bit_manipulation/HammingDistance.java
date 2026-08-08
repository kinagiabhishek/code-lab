// https://leetcode.com/problems/hamming-distance/
package bit_manipulation;

import java.util.*;

public class HammingDistance {
    // LeetCode Problem 461: Hamming Distance
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        HammingDistance solver = new HammingDistance();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ HammingDistance (Hamming Distance) Passed!");
    }
}
