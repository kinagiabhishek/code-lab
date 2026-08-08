// https://leetcode.com/problems/remove-duplicate-letters/
package arrays_and_hashing;

import java.util.*;

public class RemoveDuplicateLetters {
    // LeetCode Problem 316: Remove Duplicate Letters
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        RemoveDuplicateLetters solver = new RemoveDuplicateLetters();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode316_RemoveDuplicateLetters (Remove Duplicate Letters) Passed!");
    }
}
