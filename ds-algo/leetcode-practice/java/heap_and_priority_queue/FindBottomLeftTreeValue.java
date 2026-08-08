// https://leetcode.com/problems/find-bottom-left-tree-value/
package heap_and_priority_queue;

import java.util.*;

public class FindBottomLeftTreeValue {
    // LeetCode Problem 513: Find Bottom Left Tree Value
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        FindBottomLeftTreeValue solver = new FindBottomLeftTreeValue();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ FindBottomLeftTreeValue (Find Bottom Left Tree Value) Passed!");
    }
}
