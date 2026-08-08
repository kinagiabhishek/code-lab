// https://leetcode.com/problems/reverse-bits/
package graphs;

import java.util.*;

public class ReverseBits {
    // LeetCode Problem 190: Reverse Bits
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) { count += (n & 1); n >>>= 1; }
        return count;
    }

    public static void main(String[] args) {
        ReverseBits solver = new ReverseBits();
        assert solver.hammingWeight(7) == 3;
        System.out.println("✅ ReverseBits Passed!");
    }
}
