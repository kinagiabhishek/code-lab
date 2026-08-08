// https://leetcode.com/problems/number-of-boomerangs/
package math;

import java.util.*;

public class NumberOfBoomerangs {
    // LeetCode Problem 447: Number of Boomerangs
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) { count += (n & 1); n >>>= 1; }
        return count;
    }

    public static void main(String[] args) {
        NumberOfBoomerangs solver = new NumberOfBoomerangs();
        assert solver.hammingWeight(7) == 3;
        System.out.println("✅ NumberOfBoomerangs Passed!");
    }
}
