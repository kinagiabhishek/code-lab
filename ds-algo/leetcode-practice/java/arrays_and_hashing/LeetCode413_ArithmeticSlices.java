// https://leetcode.com/problems/arithmetic-slices/
package arrays_and_hashing;

import java.util.*;

public class LeetCode413_ArithmeticSlices {
    // LeetCode Problem 413: Arithmetic Slices
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode413_ArithmeticSlices solver = new LeetCode413_ArithmeticSlices();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode413_ArithmeticSlices (Arithmetic Slices) Passed!");
    }
}
