// https://leetcode.com/problems/valid-number/
package heap_and_priority_queue;

import java.util.*;

public class ValidNumber {
    // LeetCode Problem 65: Valid Number
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) { count += (n & 1); n >>>= 1; }
        return count;
    }

    public static void main(String[] args) {
        ValidNumber solver = new ValidNumber();
        assert solver.hammingWeight(7) == 3;
        System.out.println("✅ ValidNumber Passed!");
    }
}
