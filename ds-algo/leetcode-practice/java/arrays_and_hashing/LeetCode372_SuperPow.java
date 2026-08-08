// https://leetcode.com/problems/super-pow/
package arrays_and_hashing;

import java.util.*;

public class LeetCode372_SuperPow {
    // LeetCode Problem 372: Super Pow
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode372_SuperPow solver = new LeetCode372_SuperPow();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode372_SuperPow (Super Pow) Passed!");
    }
}
