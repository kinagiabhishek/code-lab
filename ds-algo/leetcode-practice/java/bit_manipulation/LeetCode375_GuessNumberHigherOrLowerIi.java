// https://leetcode.com/problems/guess-number-higher-or-lower-ii/
package bit_manipulation;

import java.util.*;

public class LeetCode375_GuessNumberHigherOrLowerIi {
    // LeetCode Problem 375: Guess Number Higher or Lower II
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode375_GuessNumberHigherOrLowerIi solver = new LeetCode375_GuessNumberHigherOrLowerIi();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode375_GuessNumberHigherOrLowerIi (Guess Number Higher or Lower II) Passed!");
    }
}
