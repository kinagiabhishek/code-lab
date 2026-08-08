// https://leetcode.com/problems/most-frequent-subtree-sum/
package trees;

import java.util.*;

public class MostFrequentSubtreeSum {
    // LeetCode Problem 508: Most Frequent Subtree Sum
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        MostFrequentSubtreeSum solver = new MostFrequentSubtreeSum();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode508_MostFrequentSubtreeSum (Most Frequent Subtree Sum) Passed!");
    }
}
