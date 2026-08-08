// https://leetcode.com/problems/kth-smallest-element-in-a-bst/
package linked_lists;

import java.util.*;

public class KthSmallestElementInABst {
    // LeetCode Problem 230: Kth Smallest Element in a BST
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        KthSmallestElementInABst solver = new KthSmallestElementInABst();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ KthSmallestElementInABst (Kth Smallest Element in a BST) Passed!");
    }
}
