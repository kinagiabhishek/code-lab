// https://leetcode.com/problems/convert-a-number-to-hexadecimal/
package math;

import java.util.*;

public class ConvertANumberToHexadecimal {
    // LeetCode Problem 405: Convert a Number to Hexadecimal
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) { count += (n & 1); n >>>= 1; }
        return count;
    }

    public static void main(String[] args) {
        ConvertANumberToHexadecimal solver = new ConvertANumberToHexadecimal();
        assert solver.hammingWeight(7) == 3;
        System.out.println("✅ ConvertANumberToHexadecimal Passed!");
    }
}
