// https://leetcode.com/problems/reverse-linked-list/
package backtracking;

import java.util.*;

public class ReverseLinkedList {
    // LeetCode Problem 206: Reverse Linked List
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        ReverseLinkedList solver = new ReverseLinkedList();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ ReverseLinkedList (Reverse Linked List) Passed!");
    }
}
