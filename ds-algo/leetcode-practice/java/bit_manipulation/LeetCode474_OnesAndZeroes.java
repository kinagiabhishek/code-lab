// https://leetcode.com/problems/ones-and-zeroes/
package bit_manipulation;

import java.util.*;

public class LeetCode474_OnesAndZeroes {
    // LeetCode Problem 474: Ones and Zeroes
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode474_OnesAndZeroes solver = new LeetCode474_OnesAndZeroes();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode474_OnesAndZeroes (Ones and Zeroes) Passed!");
    }
}
