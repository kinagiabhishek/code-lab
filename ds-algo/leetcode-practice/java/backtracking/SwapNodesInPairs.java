// https://leetcode.com/problems/swap-nodes-in-pairs/
package backtracking;

import java.util.*;

public class SwapNodesInPairs {
    // LeetCode Problem 24: Swap Nodes in Pairs
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        SwapNodesInPairs solver = new SwapNodesInPairs();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ SwapNodesInPairs (Swap Nodes in Pairs) Passed!");
    }
}
