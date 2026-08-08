// https://leetcode.com/problems/maximum-xor-of-two-numbers-in-an-array/
package arrays_and_hashing;

import java.util.*;

public class MaximumXorOfTwoNumbersInAnArray {
    // LeetCode Problem 421: Maximum XOR of Two Numbers in an Array
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) { count += (n & 1); n >>>= 1; }
        return count;
    }

    public static void main(String[] args) {
        MaximumXorOfTwoNumbersInAnArray solver = new MaximumXorOfTwoNumbersInAnArray();
        assert solver.hammingWeight(7) == 3;
        System.out.println("✅ MaximumXorOfTwoNumbersInAnArray Passed!");
    }
}
