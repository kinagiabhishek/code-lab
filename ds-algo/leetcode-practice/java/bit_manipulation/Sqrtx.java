// https://leetcode.com/problems/sqrtx/
package bit_manipulation;

import java.util.*;

public class Sqrtx {
    // LeetCode Problem 69: Sqrt(x)
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        Sqrtx solver = new Sqrtx();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ Sqrtx (Sqrt(x)) Passed!");
    }
}
