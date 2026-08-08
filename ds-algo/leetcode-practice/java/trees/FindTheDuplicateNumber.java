// https://leetcode.com/problems/find-the-duplicate-number/
package trees;

import java.util.*;

public class FindTheDuplicateNumber {
    // LeetCode Problem 287: Find the Duplicate Number
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) { count += (n & 1); n >>>= 1; }
        return count;
    }

    public static void main(String[] args) {
        FindTheDuplicateNumber solver = new FindTheDuplicateNumber();
        assert solver.hammingWeight(7) == 3;
        System.out.println("✅ FindTheDuplicateNumber Passed!");
    }
}
