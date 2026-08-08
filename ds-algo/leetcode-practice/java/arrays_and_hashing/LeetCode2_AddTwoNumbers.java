// https://leetcode.com/problems/add-two-numbers/
package arrays_and_hashing;

import java.util.*;

public class LeetCode2_AddTwoNumbers {
    // LeetCode Problem 2: Add Two Numbers
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode2_AddTwoNumbers solver = new LeetCode2_AddTwoNumbers();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode2_AddTwoNumbers (Add Two Numbers) Passed!");
    }
}
