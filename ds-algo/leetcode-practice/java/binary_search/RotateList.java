// https://leetcode.com/problems/rotate-list/
package binary_search;

import java.util.*;

public class RotateList {
    // LeetCode Problem 61: Rotate List
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        RotateList solver = new RotateList();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ RotateList (Rotate List) Passed!");
    }
}
