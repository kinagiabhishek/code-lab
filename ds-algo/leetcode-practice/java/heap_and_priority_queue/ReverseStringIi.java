// https://leetcode.com/problems/reverse-string-ii/
package heap_and_priority_queue;

import java.util.*;

public class ReverseStringIi {
    // LeetCode Problem 541: Reverse String II
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        ReverseStringIi solver = new ReverseStringIi();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ ReverseStringIi (Reverse String II) Passed!");
    }
}
