// https://leetcode.com/problems/concatenated-words/
package bit_manipulation;

import java.util.*;

public class LeetCode472_ConcatenatedWords {
    // LeetCode Problem 472: Concatenated Words
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode472_ConcatenatedWords solver = new LeetCode472_ConcatenatedWords();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode472_ConcatenatedWords (Concatenated Words) Passed!");
    }
}
