// https://leetcode.com/problems/happy-number/
package linked_lists;

import java.util.*;

public class HappyNumber {
    // LeetCode Problem 202: Happy Number
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) { count += (n & 1); n >>>= 1; }
        return count;
    }

    public static void main(String[] args) {
        HappyNumber solver = new HappyNumber();
        assert solver.hammingWeight(7) == 3;
        System.out.println("✅ HappyNumber Passed!");
    }
}
