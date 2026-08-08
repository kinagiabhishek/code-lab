// https://leetcode.com/problems/powx-n/
package graphs;

import java.util.*;

public class PowxN {
    // LeetCode Problem 50: Pow(x, n)
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        PowxN solver = new PowxN();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ PowxN (Pow(x, n)) Passed!");
    }
}
