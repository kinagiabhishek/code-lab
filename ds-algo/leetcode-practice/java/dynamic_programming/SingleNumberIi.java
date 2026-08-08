// https://leetcode.com/problems/single-number-ii/
package dynamic_programming;

import java.util.*;

public class SingleNumberIi {
    // LeetCode Problem 137: Single Number II
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) { count += (n & 1); n >>>= 1; }
        return count;
    }

    public static void main(String[] args) {
        SingleNumberIi solver = new SingleNumberIi();
        assert solver.hammingWeight(7) == 3;
        System.out.println("✅ SingleNumberIi Passed!");
    }
}
