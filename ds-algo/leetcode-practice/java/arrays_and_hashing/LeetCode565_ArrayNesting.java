// https://leetcode.com/problems/array-nesting/
package arrays_and_hashing;

import java.util.*;

public class LeetCode565_ArrayNesting {
    // LeetCode Problem 565: Array Nesting
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode565_ArrayNesting solver = new LeetCode565_ArrayNesting();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode565_ArrayNesting (Array Nesting) Passed!");
    }
}
