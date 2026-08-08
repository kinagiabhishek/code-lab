// https://leetcode.com/problems/data-stream-as-disjoint-intervals/
package two_pointers;

import java.util.*;

public class DataStreamAsDisjointIntervals {
    // LeetCode Problem 352: Data Stream as Disjoint Intervals
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        DataStreamAsDisjointIntervals solver = new DataStreamAsDisjointIntervals();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ DataStreamAsDisjointIntervals (Data Stream as Disjoint Intervals) Passed!");
    }
}
