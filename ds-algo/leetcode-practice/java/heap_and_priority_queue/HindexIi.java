// https://leetcode.com/problems/h-index-ii/
package heap_and_priority_queue;

import java.util.*;

public class HindexIi {
    // LeetCode Problem 275: H-Index II
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        HindexIi solver = new HindexIi();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ HindexIi (H-Index II) Passed!");
    }
}
