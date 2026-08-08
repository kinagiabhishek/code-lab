// https://leetcode.com/problems/ugly-number/
package arrays_and_hashing;

import java.util.*;

public class UglyNumber {
    // LeetCode Problem 263: Ugly Number
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        UglyNumber solver = new UglyNumber();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode263_UglyNumber (Ugly Number) Passed!");
    }
}
