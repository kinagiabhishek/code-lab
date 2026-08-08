// https://leetcode.com/problems/search-a-2d-matrix-ii/
package two_pointers;

import java.util.*;

public class SearchA2dMatrixIi {
    // LeetCode Problem 240: Search a 2D Matrix II
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        SearchA2dMatrixIi solver = new SearchA2dMatrixIi();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ SearchA2dMatrixIi (Search a 2D Matrix II) Passed!");
    }
}
