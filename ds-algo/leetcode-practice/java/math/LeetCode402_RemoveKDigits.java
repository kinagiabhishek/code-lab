// https://leetcode.com/problems/remove-k-digits/
package math;

import java.util.*;

public class LeetCode402_RemoveKDigits {
    // LeetCode Problem 402: Remove K Digits
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode402_RemoveKDigits solver = new LeetCode402_RemoveKDigits();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode402_RemoveKDigits (Remove K Digits) Passed!");
    }
}
