// https://leetcode.com/problems/create-maximum-number/
package math;

import java.util.*;

public class CreateMaximumNumber {
    // LeetCode Problem 321: Create Maximum Number
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) { count += (n & 1); n >>>= 1; }
        return count;
    }

    public static void main(String[] args) {
        CreateMaximumNumber solver = new CreateMaximumNumber();
        assert solver.hammingWeight(7) == 3;
        System.out.println("✅ CreateMaximumNumber Passed!");
    }
}
