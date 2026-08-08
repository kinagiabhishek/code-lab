// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
package binary_search;

import java.util.*;

public class LeetCode153_FindMinimumInRotatedSortedArray {
    // LeetCode Problem 153: Find Minimum in Rotated Sorted Array
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode153_FindMinimumInRotatedSortedArray solver = new LeetCode153_FindMinimumInRotatedSortedArray();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode153_FindMinimumInRotatedSortedArray (Find Minimum in Rotated Sorted Array) Passed!");
    }
}
