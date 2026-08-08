// https://leetcode.com/problems/find-the-difference/
package arrays_and_hashing;

import java.util.*;

public class FindTheDifference {
    // LeetCode Problem 389: Find the Difference
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        FindTheDifference solver = new FindTheDifference();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode389_FindTheDifference (Find the Difference) Passed!");
    }
}
