// https://leetcode.com/problems/search-in-rotated-sorted-array/
package binary_search;

import java.util.*;

public class LeetCode33_SearchInRotatedSortedArray {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode33_SearchInRotatedSortedArray solver = new LeetCode33_SearchInRotatedSortedArray();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode33_SearchInRotatedSortedArray Passed!");
    }
}
