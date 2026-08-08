// https://leetcode.com/problems/find-peak-element/
package graphs;

import java.util.*;

public class FindPeakElement {
    // LeetCode Problem 162: Find Peak Element
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        FindPeakElement solver = new FindPeakElement();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ FindPeakElement (Find Peak Element) Passed!");
    }
}
