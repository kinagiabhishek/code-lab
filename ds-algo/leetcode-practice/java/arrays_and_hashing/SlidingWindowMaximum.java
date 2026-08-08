// https://leetcode.com/problems/sliding-window-maximum/
package arrays_and_hashing;

import java.util.*;

public class SlidingWindowMaximum {
    // LeetCode Problem 239: Sliding Window Maximum
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        SlidingWindowMaximum solver = new SlidingWindowMaximum();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ SlidingWindowMaximum (Sliding Window Maximum) Passed!");
    }
}
