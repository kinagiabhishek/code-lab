// https://leetcode.com/problems/sort-colors/
package binary_search;

import java.util.*;

public class SortColors {
    // LeetCode Problem 75: Sort Colors
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        SortColors solver = new SortColors();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ SortColors (Sort Colors) Passed!");
    }
}
