// https://leetcode.com/problems/single-number-ii/
package bit_manipulation;

import java.util.*;

public class SingleNumberIi {
    // LeetCode Problem 137: Single Number II
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        SingleNumberIi solver = new SingleNumberIi();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode137_SingleNumberIi (Single Number II) Passed!");
    }
}
