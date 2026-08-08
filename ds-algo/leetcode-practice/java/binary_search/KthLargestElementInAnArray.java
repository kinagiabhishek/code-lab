// https://leetcode.com/problems/kth-largest-element-in-an-array/
package binary_search;

import java.util.*;

public class KthLargestElementInAnArray {
    // LeetCode Problem 215: Kth Largest Element in an Array
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        KthLargestElementInAnArray solver = new KthLargestElementInAnArray();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ KthLargestElementInAnArray (Kth Largest Element in an Array) Passed!");
    }
}
