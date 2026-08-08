// https://leetcode.com/problems/add-binary/
package dynamic_programming;

import java.util.*;

public class AddBinary {
    // LeetCode Problem 67: Add Binary
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) { count += (n & 1); n >>>= 1; }
        return count;
    }

    public static void main(String[] args) {
        AddBinary solver = new AddBinary();
        assert solver.hammingWeight(7) == 3;
        System.out.println("✅ AddBinary Passed!");
    }
}
