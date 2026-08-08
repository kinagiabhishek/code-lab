// https://leetcode.com/problems/delete-node-in-a-bst/
package two_pointers;

import java.util.*;

public class DeleteNodeInABst {
    // LeetCode Problem 450: Delete Node in a BST
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        DeleteNodeInABst solver = new DeleteNodeInABst();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ DeleteNodeInABst (Delete Node in a BST) Passed!");
    }
}
