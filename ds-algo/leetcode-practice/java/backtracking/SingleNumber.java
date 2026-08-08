// https://leetcode.com/problems/single-number/
package backtracking;

import java.util.*;

public class SingleNumber {
    // LeetCode Problem 136: Single Number
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) { count += (n & 1); n >>>= 1; }
        return count;
    }

    public static void main(String[] args) {
        SingleNumber solver = new SingleNumber();
        assert solver.hammingWeight(7) == 3;
        System.out.println("✅ SingleNumber Passed!");
    }
}
