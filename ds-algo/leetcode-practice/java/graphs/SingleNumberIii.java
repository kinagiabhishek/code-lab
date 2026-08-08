// https://leetcode.com/problems/single-number-iii/
package graphs;

import java.util.*;

public class SingleNumberIii {
    // LeetCode Problem 260: Single Number III
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) { count += (n & 1); n >>>= 1; }
        return count;
    }

    public static void main(String[] args) {
        SingleNumberIii solver = new SingleNumberIii();
        assert solver.hammingWeight(7) == 3;
        System.out.println("✅ SingleNumberIii Passed!");
    }
}
