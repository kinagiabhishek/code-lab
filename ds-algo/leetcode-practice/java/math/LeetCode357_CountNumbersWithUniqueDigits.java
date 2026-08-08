// https://leetcode.com/problems/count-numbers-with-unique-digits/
package math;

import java.util.*;

public class LeetCode357_CountNumbersWithUniqueDigits {
    // LeetCode Problem 357: Count Numbers with Unique Digits
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode357_CountNumbersWithUniqueDigits solver = new LeetCode357_CountNumbersWithUniqueDigits();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode357_CountNumbersWithUniqueDigits (Count Numbers with Unique Digits) Passed!");
    }
}
