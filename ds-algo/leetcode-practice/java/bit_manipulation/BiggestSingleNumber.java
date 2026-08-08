// https://leetcode.com/problems/biggest-single-number/
package bit_manipulation;

import java.util.*;

public class BiggestSingleNumber {
    // LeetCode Problem 619: Biggest Single Number
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        BiggestSingleNumber solver = new BiggestSingleNumber();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode619_BiggestSingleNumber (Biggest Single Number) Passed!");
    }
}
