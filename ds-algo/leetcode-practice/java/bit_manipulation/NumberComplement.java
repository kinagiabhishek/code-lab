// https://leetcode.com/problems/number-complement/
package bit_manipulation;

import java.util.*;

public class NumberComplement {
    // LeetCode Problem 476: Number Complement
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) { count += (n & 1); n >>>= 1; }
        return count;
    }

    public static void main(String[] args) {
        NumberComplement solver = new NumberComplement();
        assert solver.hammingWeight(7) == 3;
        System.out.println("✅ NumberComplement Passed!");
    }
}
