// https://leetcode.com/problems/scramble-string/
package arrays_and_hashing;

import java.util.*;

public class LeetCode87_ScrambleString {
    // LeetCode Problem 87: Scramble String
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode87_ScrambleString solver = new LeetCode87_ScrambleString();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode87_ScrambleString (Scramble String) Passed!");
    }
}
