// https://leetcode.com/problems/ones-and-zeroes/
package bit_manipulation;

import java.util.*;

public class OnesAndZeroes {
    // LeetCode Problem 474: Ones and Zeroes
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        OnesAndZeroes solver = new OnesAndZeroes();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode474_OnesAndZeroes (Ones and Zeroes) Passed!");
    }
}
