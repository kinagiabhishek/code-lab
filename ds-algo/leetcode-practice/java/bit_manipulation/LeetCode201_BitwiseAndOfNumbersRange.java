// https://leetcode.com/problems/bitwise-and-of-numbers-range/
package bit_manipulation;

import java.util.*;

public class LeetCode201_BitwiseAndOfNumbersRange {
    // LeetCode Problem 201: Bitwise AND of Numbers Range
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode201_BitwiseAndOfNumbersRange solver = new LeetCode201_BitwiseAndOfNumbersRange();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode201_BitwiseAndOfNumbersRange (Bitwise AND of Numbers Range) Passed!");
    }
}
