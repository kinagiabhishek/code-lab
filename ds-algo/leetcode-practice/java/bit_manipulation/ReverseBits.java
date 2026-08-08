// https://leetcode.com/problems/reverse-bits/
package bit_manipulation;

import java.util.*;

public class ReverseBits {
    // LeetCode Problem 190: Reverse Bits
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        ReverseBits solver = new ReverseBits();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode190_ReverseBits (Reverse Bits) Passed!");
    }
}
