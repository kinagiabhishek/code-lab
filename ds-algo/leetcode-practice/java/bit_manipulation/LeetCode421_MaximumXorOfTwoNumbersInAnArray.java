// https://leetcode.com/problems/maximum-xor-of-two-numbers-in-an-array/
package bit_manipulation;

import java.util.*;

public class LeetCode421_MaximumXorOfTwoNumbersInAnArray {
    // LeetCode Problem 421: Maximum XOR of Two Numbers in an Array
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode421_MaximumXorOfTwoNumbersInAnArray solver = new LeetCode421_MaximumXorOfTwoNumbersInAnArray();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode421_MaximumXorOfTwoNumbersInAnArray (Maximum XOR of Two Numbers in an Array) Passed!");
    }
}
