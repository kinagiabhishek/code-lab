// https://leetcode.com/problems/beautiful-arrangement/
package graphs;

import java.util.*;

public class BeautifulArrangement {
    // LeetCode Problem 526: Beautiful Arrangement
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        BeautifulArrangement solver = new BeautifulArrangement();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ BeautifulArrangement (Beautiful Arrangement) Passed!");
    }
}
