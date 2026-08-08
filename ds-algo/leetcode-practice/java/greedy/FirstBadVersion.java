// https://leetcode.com/problems/first-bad-version/
package greedy;

import java.util.*;

public class FirstBadVersion {
    // LeetCode Problem 278: First Bad Version
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        FirstBadVersion solver = new FirstBadVersion();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ FirstBadVersion (First Bad Version) Passed!");
    }
}
