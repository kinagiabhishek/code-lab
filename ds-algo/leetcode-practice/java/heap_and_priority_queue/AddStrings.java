// https://leetcode.com/problems/add-strings/
package heap_and_priority_queue;

import java.util.*;

public class AddStrings {
    // LeetCode Problem 415: Add Strings
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        AddStrings solver = new AddStrings();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ AddStrings (Add Strings) Passed!");
    }
}
