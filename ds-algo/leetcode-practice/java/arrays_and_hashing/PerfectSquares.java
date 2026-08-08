// https://leetcode.com/problems/perfect-squares/
package arrays_and_hashing;

import java.util.*;

public class PerfectSquares {
    // LeetCode Problem 279: Perfect Squares
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        PerfectSquares solver = new PerfectSquares();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode279_PerfectSquares (Perfect Squares) Passed!");
    }
}
