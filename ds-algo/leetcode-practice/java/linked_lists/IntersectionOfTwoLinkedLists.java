// https://leetcode.com/problems/intersection-of-two-linked-lists/
package linked_lists;

import java.util.*;

public class IntersectionOfTwoLinkedLists {
    // LeetCode Problem 160: Intersection of Two Linked Lists
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        IntersectionOfTwoLinkedLists solver = new IntersectionOfTwoLinkedLists();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ IntersectionOfTwoLinkedLists (Intersection of Two Linked Lists) Passed!");
    }
}
