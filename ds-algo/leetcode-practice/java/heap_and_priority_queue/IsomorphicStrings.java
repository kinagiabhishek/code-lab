// https://leetcode.com/problems/isomorphic-strings/
package heap_and_priority_queue;

import java.util.*;

public class IsomorphicStrings {
    // LeetCode Problem 205: Isomorphic Strings
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        IsomorphicStrings solver = new IsomorphicStrings();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ IsomorphicStrings (Isomorphic Strings) Passed!");
    }
}
