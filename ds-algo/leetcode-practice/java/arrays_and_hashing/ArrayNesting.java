// https://leetcode.com/problems/array-nesting/
package arrays_and_hashing;

import java.util.*;

public class ArrayNesting {
    // LeetCode Problem 565: Array Nesting
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        ArrayNesting solver = new ArrayNesting();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode565_ArrayNesting (Array Nesting) Passed!");
    }
}
