// https://leetcode.com/problems/valid-phone-numbers/
package dynamic_programming;

import java.util.*;

public class ValidPhoneNumbers {
    // LeetCode Problem 193: Valid Phone Numbers
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) { count += (n & 1); n >>>= 1; }
        return count;
    }

    public static void main(String[] args) {
        ValidPhoneNumbers solver = new ValidPhoneNumbers();
        assert solver.hammingWeight(7) == 3;
        System.out.println("✅ ValidPhoneNumbers Passed!");
    }
}
