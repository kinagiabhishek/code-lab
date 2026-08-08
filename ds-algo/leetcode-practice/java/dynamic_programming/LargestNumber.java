// https://leetcode.com/problems/largest-number/
package dynamic_programming;

import java.util.*;

public class LargestNumber {
    // LeetCode Problem 179: Largest Number
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) { count += (n & 1); n >>>= 1; }
        return count;
    }

    public static void main(String[] args) {
        LargestNumber solver = new LargestNumber();
        assert solver.hammingWeight(7) == 3;
        System.out.println("✅ LargestNumber Passed!");
    }
}
