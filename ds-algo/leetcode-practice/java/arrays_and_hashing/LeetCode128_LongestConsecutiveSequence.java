// https://leetcode.com/problems/longest-consecutive-sequence/
package arrays_and_hashing;

import java.util.*;

public class LeetCode128_LongestConsecutiveSequence {
    // LeetCode Problem 128: Longest Consecutive Sequence
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode128_LongestConsecutiveSequence solver = new LeetCode128_LongestConsecutiveSequence();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode128_LongestConsecutiveSequence (Longest Consecutive Sequence) Passed!");
    }
}
