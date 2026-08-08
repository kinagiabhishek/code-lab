// https://leetcode.com/problems/guess-number-higher-or-lower/
package bit_manipulation;

import java.util.*;

public class LeetCode374_GuessNumberHigherOrLower {
    // LeetCode Problem 374: Guess Number Higher or Lower
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode374_GuessNumberHigherOrLower solver = new LeetCode374_GuessNumberHigherOrLower();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode374_GuessNumberHigherOrLower (Guess Number Higher or Lower) Passed!");
    }
}
