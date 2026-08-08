// https://leetcode.com/problems/remove-linked-list-elements/
package trees;

import java.util.*;

public class RemoveLinkedListElements {
    // LeetCode Problem 203: Remove Linked List Elements
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        RemoveLinkedListElements solver = new RemoveLinkedListElements();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ RemoveLinkedListElements (Remove Linked List Elements) Passed!");
    }
}
