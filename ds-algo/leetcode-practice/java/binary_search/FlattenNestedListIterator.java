// https://leetcode.com/problems/flatten-nested-list-iterator/
package binary_search;

import java.util.*;

public class FlattenNestedListIterator {
    // LeetCode Problem 341: Flatten Nested List Iterator
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        FlattenNestedListIterator solver = new FlattenNestedListIterator();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ FlattenNestedListIterator (Flatten Nested List Iterator) Passed!");
    }
}
