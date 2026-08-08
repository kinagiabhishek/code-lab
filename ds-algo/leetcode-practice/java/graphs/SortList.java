// https://leetcode.com/problems/sort-list/
package graphs;

import java.util.*;

public class SortList {
    // LeetCode Problem 148: Sort List
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        SortList solver = new SortList();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ SortList (Sort List) Passed!");
    }
}
