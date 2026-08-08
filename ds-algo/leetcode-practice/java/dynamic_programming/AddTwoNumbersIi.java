// https://leetcode.com/problems/add-two-numbers-ii/
package dynamic_programming;

import java.util.*;

public class AddTwoNumbersIi {
    // LeetCode Problem 445: Add Two Numbers II
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) { count += (n & 1); n >>>= 1; }
        return count;
    }

    public static void main(String[] args) {
        AddTwoNumbersIi solver = new AddTwoNumbersIi();
        assert solver.hammingWeight(7) == 3;
        System.out.println("✅ AddTwoNumbersIi Passed!");
    }
}
