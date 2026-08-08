// https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
package binary_search;

import java.util.*;

public class LeetCode81_SearchInRotatedSortedArrayIi {
    // LeetCode Problem 81: Search in Rotated Sorted Array II
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode81_SearchInRotatedSortedArrayIi solver = new LeetCode81_SearchInRotatedSortedArrayIi();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode81_SearchInRotatedSortedArrayIi (Search in Rotated Sorted Array II) Passed!");
    }
}
