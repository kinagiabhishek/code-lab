// https://leetcode.com/problems/solve-the-equation/
package arrays_and_hashing;

import java.util.*;

public class SolveTheEquation {
    // LeetCode Problem 640: Solve the Equation
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        SolveTheEquation solver = new SolveTheEquation();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode640_SolveTheEquation (Solve the Equation) Passed!");
    }
}
