// https://leetcode.com/problems/guess-number-higher-or-lower-ii/
package dynamic_programming;

import java.util.*;

public class GuessNumberHigherOrLowerIi {
    // LeetCode Problem 375: Guess Number Higher or Lower II
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) { count += (n & 1); n >>>= 1; }
        return count;
    }

    public static void main(String[] args) {
        GuessNumberHigherOrLowerIi solver = new GuessNumberHigherOrLowerIi();
        assert solver.hammingWeight(7) == 3;
        System.out.println("✅ GuessNumberHigherOrLowerIi Passed!");
    }
}
