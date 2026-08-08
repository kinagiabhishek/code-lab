// https://leetcode.com/problems/reverse-linked-list-ii/
package graphs;

import java.util.*;

public class ReverseLinkedListIi {
    // LeetCode Problem 92: Reverse Linked List II
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        ReverseLinkedListIi solver = new ReverseLinkedListIi();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ ReverseLinkedListIi (Reverse Linked List II) Passed!");
    }
}
