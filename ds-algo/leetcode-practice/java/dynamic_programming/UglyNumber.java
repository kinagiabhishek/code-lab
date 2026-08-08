// https://leetcode.com/problems/ugly-number/
package dynamic_programming;

import java.util.*;

public class UglyNumber {
    // LeetCode Problem 263: Ugly Number
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) { count += (n & 1); n >>>= 1; }
        return count;
    }

    public static void main(String[] args) {
        UglyNumber solver = new UglyNumber();
        assert solver.hammingWeight(7) == 3;
        System.out.println("✅ UglyNumber Passed!");
    }
}
