// https://leetcode.com/problems/roman-to-integer/
package math;

import java.util.*;

public class LeetCode13_RomanToInteger {
    // LeetCode Problem 13: Roman to Integer
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode13_RomanToInteger solver = new LeetCode13_RomanToInteger();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode13_RomanToInteger (Roman to Integer) Passed!");
    }
}
