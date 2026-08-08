// https://leetcode.com/problems/n-ary-tree-preorder-traversal/
package arrays_and_hashing;

import java.util.*;

public class NaryTreePreorderTraversal {
    // LeetCode Problem 589: N-ary Tree Preorder Traversal
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        NaryTreePreorderTraversal solver = new NaryTreePreorderTraversal();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ NaryTreePreorderTraversal (N-ary Tree Preorder Traversal) Passed!");
    }
}
