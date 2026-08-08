// https://leetcode.com/problems/number-of-digit-one/
package heap_and_priority_queue;

import java.util.*;

public class NumberOfDigitOne {
    // LeetCode Problem 233: Number of Digit One
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) { count += (n & 1); n >>>= 1; }
        return count;
    }

    public static void main(String[] args) {
        NumberOfDigitOne solver = new NumberOfDigitOne();
        assert solver.hammingWeight(7) == 3;
        System.out.println("✅ NumberOfDigitOne Passed!");
    }
}
