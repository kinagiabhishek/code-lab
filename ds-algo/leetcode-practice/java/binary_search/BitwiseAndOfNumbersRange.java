// https://leetcode.com/problems/bitwise-and-of-numbers-range/
package binary_search;

import java.util.*;

public class BitwiseAndOfNumbersRange {
    // LeetCode Problem 201: Bitwise AND of Numbers Range
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) { count += (n & 1); n >>>= 1; }
        return count;
    }

    public static void main(String[] args) {
        BitwiseAndOfNumbersRange solver = new BitwiseAndOfNumbersRange();
        assert solver.hammingWeight(7) == 3;
        System.out.println("✅ BitwiseAndOfNumbersRange Passed!");
    }
}
