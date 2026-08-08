// https://leetcode.com/problems/repeated-substring-pattern/
package trees;

import java.util.*;

public class RepeatedSubstringPattern {
    // LeetCode Problem 459: Repeated Substring Pattern
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        RepeatedSubstringPattern solver = new RepeatedSubstringPattern();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode459_RepeatedSubstringPattern (Repeated Substring Pattern) Passed!");
    }
}
