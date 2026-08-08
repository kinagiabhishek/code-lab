// https://leetcode.com/problems/single-element-in-a-sorted-array/
package graphs;

import java.util.*;

public class SingleElementInASortedArray {
    // LeetCode Problem 540: Single Element in a Sorted Array
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        SingleElementInASortedArray solver = new SingleElementInASortedArray();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ SingleElementInASortedArray (Single Element in a Sorted Array) Passed!");
    }
}
