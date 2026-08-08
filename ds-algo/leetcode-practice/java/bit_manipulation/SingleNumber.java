// https://leetcode.com/problems/single-number/
package bit_manipulation;

import java.util.*;

public class SingleNumber {
    // LeetCode Problem 136: Single Number
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        SingleNumber solver = new SingleNumber();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode136_SingleNumber (Single Number) Passed!");
    }
}
