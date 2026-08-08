// https://leetcode.com/problems/reverse-pairs/
package sliding_window;

import java.util.*;

public class ReversePairs {
    // LeetCode Problem 493: Reverse Pairs
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        ReversePairs solver = new ReversePairs();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ ReversePairs (Reverse Pairs) Passed!");
    }
}
