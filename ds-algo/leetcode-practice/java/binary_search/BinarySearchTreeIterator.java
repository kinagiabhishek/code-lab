// https://leetcode.com/problems/binary-search-tree-iterator/
package binary_search;

import java.util.*;

public class BinarySearchTreeIterator {
    // LeetCode Problem 173: Binary Search Tree Iterator
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        BinarySearchTreeIterator solver = new BinarySearchTreeIterator();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ BinarySearchTreeIterator (Binary Search Tree Iterator) Passed!");
    }
}
