// https://leetcode.com/problems/binary-watch/
package heap_and_priority_queue;

import java.util.*;

public class BinaryWatch {
    // LeetCode Problem 401: Binary Watch
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) { count += (n & 1); n >>>= 1; }
        return count;
    }

    public static void main(String[] args) {
        BinaryWatch solver = new BinaryWatch();
        assert solver.hammingWeight(7) == 3;
        System.out.println("✅ BinaryWatch Passed!");
    }
}
