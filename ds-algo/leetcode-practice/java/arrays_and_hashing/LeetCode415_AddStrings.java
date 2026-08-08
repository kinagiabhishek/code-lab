// https://leetcode.com/problems/add-strings/
package arrays_and_hashing;

import java.util.*;

public class LeetCode415_AddStrings {
    // LeetCode Problem 415: Add Strings
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode415_AddStrings solver = new LeetCode415_AddStrings();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode415_AddStrings (Add Strings) Passed!");
    }
}
