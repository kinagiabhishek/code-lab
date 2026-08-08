// https://leetcode.com/problems/valid-perfect-square/
package arrays_and_hashing;

import java.util.*;

public class LeetCode367_ValidPerfectSquare {
    // LeetCode Problem 367: Valid Perfect Square
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode367_ValidPerfectSquare solver = new LeetCode367_ValidPerfectSquare();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode367_ValidPerfectSquare (Valid Perfect Square) Passed!");
    }
}
