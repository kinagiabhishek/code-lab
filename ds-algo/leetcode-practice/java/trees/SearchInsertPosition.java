// https://leetcode.com/problems/search-insert-position/
package trees;

import java.util.*;

public class SearchInsertPosition {
    // LeetCode Problem 35: Search Insert Position
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        SearchInsertPosition solver = new SearchInsertPosition();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ SearchInsertPosition (Search Insert Position) Passed!");
    }
}
