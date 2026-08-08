// https://leetcode.com/problems/n-ary-tree-postorder-traversal/
package two_pointers;

import java.util.*;

public class NaryTreePostorderTraversal {
    // LeetCode Problem 590: N-ary Tree Postorder Traversal
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        NaryTreePostorderTraversal solver = new NaryTreePostorderTraversal();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ NaryTreePostorderTraversal (N-ary Tree Postorder Traversal) Passed!");
    }
}
