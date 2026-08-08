// https://leetcode.com/problems/number-of-1-bits/
package heap_and_priority_queue;

import java.util.*;

public class NumberOf1Bits {
    // LeetCode Problem 191: Number of 1 Bits
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) { count += (n & 1); n >>>= 1; }
        return count;
    }

    public static void main(String[] args) {
        NumberOf1Bits solver = new NumberOf1Bits();
        assert solver.hammingWeight(7) == 3;
        System.out.println("✅ NumberOf1Bits Passed!");
    }
}
