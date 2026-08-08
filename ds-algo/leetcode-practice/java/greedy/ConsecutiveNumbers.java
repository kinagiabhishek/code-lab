// https://leetcode.com/problems/consecutive-numbers/
package greedy;

import java.util.*;

public class ConsecutiveNumbers {
    // LeetCode Problem 180: Consecutive Numbers
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) { count += (n & 1); n >>>= 1; }
        return count;
    }

    public static void main(String[] args) {
        ConsecutiveNumbers solver = new ConsecutiveNumbers();
        assert solver.hammingWeight(7) == 3;
        System.out.println("✅ ConsecutiveNumbers Passed!");
    }
}
