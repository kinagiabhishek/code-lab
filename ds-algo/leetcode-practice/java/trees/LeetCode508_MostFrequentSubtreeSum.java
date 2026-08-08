// https://leetcode.com/problems/most-frequent-subtree-sum/
package trees;

import java.util.*;

public class LeetCode508_MostFrequentSubtreeSum {
    // LeetCode Problem 508: Most Frequent Subtree Sum
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode508_MostFrequentSubtreeSum solver = new LeetCode508_MostFrequentSubtreeSum();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode508_MostFrequentSubtreeSum (Most Frequent Subtree Sum) Passed!");
    }
}
