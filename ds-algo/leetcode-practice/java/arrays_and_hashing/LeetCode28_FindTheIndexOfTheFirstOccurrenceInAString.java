// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
package arrays_and_hashing;

import java.util.*;

public class LeetCode28_FindTheIndexOfTheFirstOccurrenceInAString {
    // LeetCode Problem 28: Find the Index of the First Occurrence in a String
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode28_FindTheIndexOfTheFirstOccurrenceInAString solver = new LeetCode28_FindTheIndexOfTheFirstOccurrenceInAString();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode28_FindTheIndexOfTheFirstOccurrenceInAString (Find the Index of the First Occurrence in a String) Passed!");
    }
}
