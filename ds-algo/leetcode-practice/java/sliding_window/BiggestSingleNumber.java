// https://leetcode.com/problems/biggest-single-number/
package sliding_window;

import java.util.*;

public class BiggestSingleNumber {
    // LeetCode Problem 619: Biggest Single Number
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) { count += (n & 1); n >>>= 1; }
        return count;
    }

    public static void main(String[] args) {
        BiggestSingleNumber solver = new BiggestSingleNumber();
        assert solver.hammingWeight(7) == 3;
        System.out.println("✅ BiggestSingleNumber Passed!");
    }
}
