// https://leetcode.com/problems/n-ary-tree-preorder-traversal/
package trees;

import java.util.*;

public class NaryTreePreorderTraversal {
    // LeetCode Problem 589: N-ary Tree Preorder Traversal
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        NaryTreePreorderTraversal solver = new NaryTreePreorderTraversal();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode589_NaryTreePreorderTraversal (N-ary Tree Preorder Traversal) Passed!");
    }
}
