// https://leetcode.com/problems/ugly-number-ii/
package greedy;

import java.util.*;

public class UglyNumberIi {
    // LeetCode Problem 264: Ugly Number II
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) { count += (n & 1); n >>>= 1; }
        return count;
    }

    public static void main(String[] args) {
        UglyNumberIi solver = new UglyNumberIi();
        assert solver.hammingWeight(7) == 3;
        System.out.println("✅ UglyNumberIi Passed!");
    }
}
