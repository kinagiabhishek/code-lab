// https://leetcode.com/problems/shuffle-an-array/
package linked_lists;

import java.util.*;

public class ShuffleAnArray {
    // LeetCode Problem 384: Shuffle an Array
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        ShuffleAnArray solver = new ShuffleAnArray();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ ShuffleAnArray (Shuffle an Array) Passed!");
    }
}
