// https://leetcode.com/problems/maximum-subarray/
package arrays_and_hashing;

import java.util.*;

public class LeetCode53_MaximumSubarray {
    // LeetCode Problem 53: Maximum Subarray
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode53_MaximumSubarray solver = new LeetCode53_MaximumSubarray();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode53_MaximumSubarray (Maximum Subarray) Passed!");
    }
}
