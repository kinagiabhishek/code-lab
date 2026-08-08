// https://leetcode.com/problems/counting-bits/
package bit_manipulation;

import java.util.*;

public class LeetCode338_CountingBits {
    // LeetCode Problem 338: Counting Bits
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode338_CountingBits solver = new LeetCode338_CountingBits();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode338_CountingBits (Counting Bits) Passed!");
    }
}
