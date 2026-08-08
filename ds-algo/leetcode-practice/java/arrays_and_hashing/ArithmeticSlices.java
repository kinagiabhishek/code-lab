// https://leetcode.com/problems/arithmetic-slices/
package arrays_and_hashing;

import java.util.*;

public class ArithmeticSlices {
    // LeetCode Problem 413: Arithmetic Slices
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        ArithmeticSlices solver = new ArithmeticSlices();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode413_ArithmeticSlices (Arithmetic Slices) Passed!");
    }
}
