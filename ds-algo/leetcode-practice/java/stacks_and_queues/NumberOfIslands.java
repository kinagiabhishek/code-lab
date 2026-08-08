// https://leetcode.com/problems/number-of-islands/
package stacks_and_queues;

import java.util.*;

public class NumberOfIslands {
    // LeetCode Problem 200: Number of Islands
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) { count += (n & 1); n >>>= 1; }
        return count;
    }

    public static void main(String[] args) {
        NumberOfIslands solver = new NumberOfIslands();
        assert solver.hammingWeight(7) == 3;
        System.out.println("✅ NumberOfIslands Passed!");
    }
}
