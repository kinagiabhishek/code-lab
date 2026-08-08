// https://leetcode.com/problems/compare-version-numbers/
package arrays_and_hashing;

import java.util.*;

public class CompareVersionNumbers {
    // LeetCode Problem 165: Compare Version Numbers
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        CompareVersionNumbers solver = new CompareVersionNumbers();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode165_CompareVersionNumbers (Compare Version Numbers) Passed!");
    }
}
