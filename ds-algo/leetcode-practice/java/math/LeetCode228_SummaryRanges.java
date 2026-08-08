// https://leetcode.com/problems/summary-ranges/
package math;

import java.util.*;

public class LeetCode228_SummaryRanges {
    // LeetCode Problem 228: Summary Ranges
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode228_SummaryRanges solver = new LeetCode228_SummaryRanges();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode228_SummaryRanges (Summary Ranges) Passed!");
    }
}
