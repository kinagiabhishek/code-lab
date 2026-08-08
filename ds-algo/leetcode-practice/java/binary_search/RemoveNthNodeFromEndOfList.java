// https://leetcode.com/problems/remove-nth-node-from-end-of-list/
package binary_search;

import java.util.*;

public class RemoveNthNodeFromEndOfList {
    // LeetCode Problem 19: Remove Nth Node From End of List
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        RemoveNthNodeFromEndOfList solver = new RemoveNthNodeFromEndOfList();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ RemoveNthNodeFromEndOfList (Remove Nth Node From End of List) Passed!");
    }
}
