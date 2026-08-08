// https://leetcode.com/problems/counting-bits/
package two_pointers;

import java.util.*;

public class CountingBits {
    // LeetCode Problem 338: Counting Bits
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) { count += (n & 1); n >>>= 1; }
        return count;
    }

    public static void main(String[] args) {
        CountingBits solver = new CountingBits();
        assert solver.hammingWeight(7) == 3;
        System.out.println("✅ CountingBits Passed!");
    }
}
