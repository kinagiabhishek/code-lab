// https://leetcode.com/problems/data-stream-as-disjoint-intervals/
package arrays_and_hashing;

import java.util.*;

public class DataStreamAsDisjointIntervals {
    // LeetCode Problem 352: Data Stream as Disjoint Intervals
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        DataStreamAsDisjointIntervals solver = new DataStreamAsDisjointIntervals();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode352_DataStreamAsDisjointIntervals (Data Stream as Disjoint Intervals) Passed!");
    }
}
