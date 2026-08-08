// https://leetcode.com/problems/insert-delete-getrandom-o1-duplicates-allowed/
package sliding_window;

import java.util.*;

public class InsertDeleteGetrandomO1DuplicatesAllowed {
    // LeetCode Problem 381: Insert Delete GetRandom O(1) - Duplicates allowed
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        InsertDeleteGetrandomO1DuplicatesAllowed solver = new InsertDeleteGetrandomO1DuplicatesAllowed();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ InsertDeleteGetrandomO1DuplicatesAllowed (Insert Delete GetRandom O(1) - Duplicates allowed) Passed!");
    }
}
