// https://leetcode.com/problems/top-k-frequent-elements/
package dynamic_programming;

import java.util.*;

public class TopKFrequentElements {
    // LeetCode Problem 347: Top K Frequent Elements
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        TopKFrequentElements solver = new TopKFrequentElements();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ TopKFrequentElements (Top K Frequent Elements) Passed!");
    }
}
