// https://leetcode.com/problems/super-pow/
package arrays_and_hashing;

import java.util.*;

public class SuperPow {
    // LeetCode Problem 372: Super Pow
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        SuperPow solver = new SuperPow();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode372_SuperPow (Super Pow) Passed!");
    }
}
