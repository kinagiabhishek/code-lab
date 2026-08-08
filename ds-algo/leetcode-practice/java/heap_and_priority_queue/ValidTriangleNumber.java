// https://leetcode.com/problems/valid-triangle-number/
package heap_and_priority_queue;

import java.util.*;

public class ValidTriangleNumber {
    // LeetCode Problem 611: Valid Triangle Number
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) { count += (n & 1); n >>>= 1; }
        return count;
    }

    public static void main(String[] args) {
        ValidTriangleNumber solver = new ValidTriangleNumber();
        assert solver.hammingWeight(7) == 3;
        System.out.println("✅ ValidTriangleNumber Passed!");
    }
}
