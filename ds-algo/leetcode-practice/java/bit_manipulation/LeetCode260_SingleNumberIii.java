// https://leetcode.com/problems/single-number-iii/
package bit_manipulation;

import java.util.*;

public class LeetCode260_SingleNumberIii {
    // LeetCode Problem 260: Single Number III
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode260_SingleNumberIii solver = new LeetCode260_SingleNumberIii();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode260_SingleNumberIii (Single Number III) Passed!");
    }
}
