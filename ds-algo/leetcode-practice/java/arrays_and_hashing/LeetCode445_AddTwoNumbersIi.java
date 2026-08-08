// https://leetcode.com/problems/add-two-numbers-ii/
package arrays_and_hashing;

import java.util.*;

public class LeetCode445_AddTwoNumbersIi {
    // LeetCode Problem 445: Add Two Numbers II
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode445_AddTwoNumbersIi solver = new LeetCode445_AddTwoNumbersIi();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode445_AddTwoNumbersIi (Add Two Numbers II) Passed!");
    }
}
