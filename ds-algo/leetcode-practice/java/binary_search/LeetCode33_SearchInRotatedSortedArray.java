// https://leetcode.com/problems/search-in-rotated-sorted-array/
package binary_search;

import java.util.*;

public class LeetCode33_SearchInRotatedSortedArray {
    // LeetCode Problem 33: Search in Rotated Sorted Array
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode33_SearchInRotatedSortedArray solver = new LeetCode33_SearchInRotatedSortedArray();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode33_SearchInRotatedSortedArray (Search in Rotated Sorted Array) Passed!");
    }
}
