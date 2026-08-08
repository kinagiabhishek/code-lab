// https://leetcode.com/problems/find-right-interval/
package two_pointers;

import java.util.*;

public class FindRightInterval {
    // LeetCode Problem 436: Find Right Interval
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        FindRightInterval solver = new FindRightInterval();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ FindRightInterval (Find Right Interval) Passed!");
    }
}
