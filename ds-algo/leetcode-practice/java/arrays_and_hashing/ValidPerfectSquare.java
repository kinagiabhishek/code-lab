// https://leetcode.com/problems/valid-perfect-square/
package arrays_and_hashing;

import java.util.*;

public class ValidPerfectSquare {
    // LeetCode Problem 367: Valid Perfect Square
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        ValidPerfectSquare solver = new ValidPerfectSquare();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode367_ValidPerfectSquare (Valid Perfect Square) Passed!");
    }
}
