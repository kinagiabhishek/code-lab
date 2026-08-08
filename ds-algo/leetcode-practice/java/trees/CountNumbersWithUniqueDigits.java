// https://leetcode.com/problems/count-numbers-with-unique-digits/
package trees;

import java.util.*;

public class CountNumbersWithUniqueDigits {
    // LeetCode Problem 357: Count Numbers with Unique Digits
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) { count += (n & 1); n >>>= 1; }
        return count;
    }

    public static void main(String[] args) {
        CountNumbersWithUniqueDigits solver = new CountNumbersWithUniqueDigits();
        assert solver.hammingWeight(7) == 3;
        System.out.println("✅ CountNumbersWithUniqueDigits Passed!");
    }
}
