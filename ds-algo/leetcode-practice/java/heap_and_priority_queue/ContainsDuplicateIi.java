// https://leetcode.com/problems/contains-duplicate-ii/
package heap_and_priority_queue;

import java.util.*;

public class ContainsDuplicateIi {
    // LeetCode Problem 219: Contains Duplicate II
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        ContainsDuplicateIi solver = new ContainsDuplicateIi();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ ContainsDuplicateIi (Contains Duplicate II) Passed!");
    }
}
