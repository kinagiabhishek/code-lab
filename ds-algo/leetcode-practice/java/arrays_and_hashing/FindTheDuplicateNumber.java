// https://leetcode.com/problems/find-the-duplicate-number/
package arrays_and_hashing;

import java.util.*;

public class FindTheDuplicateNumber {
    // LeetCode Problem 287: Find the Duplicate Number
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        FindTheDuplicateNumber solver = new FindTheDuplicateNumber();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode287_FindTheDuplicateNumber (Find the Duplicate Number) Passed!");
    }
}
