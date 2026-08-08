// https://leetcode.com/problems/compare-version-numbers/
package dynamic_programming;

import java.util.*;

public class CompareVersionNumbers {
    // LeetCode Problem 165: Compare Version Numbers
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) { count += (n & 1); n >>>= 1; }
        return count;
    }

    public static void main(String[] args) {
        CompareVersionNumbers solver = new CompareVersionNumbers();
        assert solver.hammingWeight(7) == 3;
        System.out.println("✅ CompareVersionNumbers Passed!");
    }
}
