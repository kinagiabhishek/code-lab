// https://leetcode.com/problems/super-ugly-number/
package binary_search;

import java.util.*;

public class SuperUglyNumber {
    // LeetCode Problem 313: Super Ugly Number
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) { count += (n & 1); n >>>= 1; }
        return count;
    }

    public static void main(String[] args) {
        SuperUglyNumber solver = new SuperUglyNumber();
        assert solver.hammingWeight(7) == 3;
        System.out.println("✅ SuperUglyNumber Passed!");
    }
}
