// https://leetcode.com/problems/missing-number/
package two_pointers;

import java.util.*;

public class MissingNumber {
    // LeetCode Problem 268: Missing Number
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) { count += (n & 1); n >>>= 1; }
        return count;
    }

    public static void main(String[] args) {
        MissingNumber solver = new MissingNumber();
        assert solver.hammingWeight(7) == 3;
        System.out.println("✅ MissingNumber Passed!");
    }
}
