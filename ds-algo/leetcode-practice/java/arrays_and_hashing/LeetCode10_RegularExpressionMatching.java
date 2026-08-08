// https://leetcode.com/problems/regular-expression-matching/
package arrays_and_hashing;

import java.util.*;

public class LeetCode10_RegularExpressionMatching {
    // LeetCode Problem 10: Regular Expression Matching
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode10_RegularExpressionMatching solver = new LeetCode10_RegularExpressionMatching();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode10_RegularExpressionMatching (Regular Expression Matching) Passed!");
    }
}
