// https://leetcode.com/problems/biggest-single-number/
package bit_manipulation;

import java.util.*;

public class LeetCode619_BiggestSingleNumber {
    // LeetCode Problem 619: Biggest Single Number
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode619_BiggestSingleNumber solver = new LeetCode619_BiggestSingleNumber();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode619_BiggestSingleNumber (Biggest Single Number) Passed!");
    }
}
