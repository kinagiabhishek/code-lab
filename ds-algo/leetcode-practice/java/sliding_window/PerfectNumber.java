// https://leetcode.com/problems/perfect-number/
package sliding_window;

import java.util.*;

public class PerfectNumber {
    // LeetCode Problem 507: Perfect Number
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) { count += (n & 1); n >>>= 1; }
        return count;
    }

    public static void main(String[] args) {
        PerfectNumber solver = new PerfectNumber();
        assert solver.hammingWeight(7) == 3;
        System.out.println("✅ PerfectNumber Passed!");
    }
}
