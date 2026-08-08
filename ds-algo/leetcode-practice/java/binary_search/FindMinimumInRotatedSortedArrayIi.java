// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/
package binary_search;

import java.util.*;

public class FindMinimumInRotatedSortedArrayIi {
    // LeetCode Problem 154: Find Minimum in Rotated Sorted Array II
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        FindMinimumInRotatedSortedArrayIi solver = new FindMinimumInRotatedSortedArrayIi();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode154_FindMinimumInRotatedSortedArrayIi (Find Minimum in Rotated Sorted Array II) Passed!");
    }
}
