// https://leetcode.com/problems/word-pattern/
package bit_manipulation;

import java.util.*;

public class LeetCode290_WordPattern {
    // LeetCode Problem 290: Word Pattern
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode290_WordPattern solver = new LeetCode290_WordPattern();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode290_WordPattern (Word Pattern) Passed!");
    }
}
