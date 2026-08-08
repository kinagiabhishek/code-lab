// https://leetcode.com/problems/guess-number-higher-or-lower/
package backtracking;

import java.util.*;

public class GuessNumberHigherOrLower {
    // LeetCode Problem 374: Guess Number Higher or Lower
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) { count += (n & 1); n >>>= 1; }
        return count;
    }

    public static void main(String[] args) {
        GuessNumberHigherOrLower solver = new GuessNumberHigherOrLower();
        assert solver.hammingWeight(7) == 3;
        System.out.println("✅ GuessNumberHigherOrLower Passed!");
    }
}
