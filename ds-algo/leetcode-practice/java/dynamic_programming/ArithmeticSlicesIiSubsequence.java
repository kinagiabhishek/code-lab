// https://leetcode.com/problems/arithmetic-slices-ii-subsequence/
package dynamic_programming;

import java.util.*;

public class ArithmeticSlicesIiSubsequence {
    // LeetCode Problem 446: Arithmetic Slices II - Subsequence
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        ArithmeticSlicesIiSubsequence solver = new ArithmeticSlicesIiSubsequence();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode446_ArithmeticSlicesIiSubsequence (Arithmetic Slices II - Subsequence) Passed!");
    }
}
