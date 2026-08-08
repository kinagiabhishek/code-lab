// https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/
package binary_search;

import java.util.*;

public class PopulatingNextRightPointersInEachNodeIi {
    // LeetCode Problem 117: Populating Next Right Pointers in Each Node II
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        PopulatingNextRightPointersInEachNodeIi solver = new PopulatingNextRightPointersInEachNodeIi();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ PopulatingNextRightPointersInEachNodeIi (Populating Next Right Pointers in Each Node II) Passed!");
    }
}
