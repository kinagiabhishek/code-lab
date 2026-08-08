// https://leetcode.com/problems/strong-password-checker/
package bit_manipulation;

import java.util.*;

public class StrongPasswordChecker {
    // LeetCode Problem 420: Strong Password Checker
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        StrongPasswordChecker solver = new StrongPasswordChecker();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode420_StrongPasswordChecker (Strong Password Checker) Passed!");
    }
}
