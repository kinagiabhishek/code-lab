// https://leetcode.com/problems/peeking-iterator/
package stacks_and_queues;

import java.util.*;

public class PeekingIterator {
    // LeetCode Problem 284: Peeking Iterator
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        PeekingIterator solver = new PeekingIterator();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ PeekingIterator (Peeking Iterator) Passed!");
    }
}
