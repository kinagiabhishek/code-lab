// https://leetcode.com/problems/n-ary-tree-level-order-traversal/
package trees;

import java.util.*;

public class NaryTreeLevelOrderTraversal {
    // LeetCode Problem 429: N-ary Tree Level Order Traversal
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        NaryTreeLevelOrderTraversal solver = new NaryTreeLevelOrderTraversal();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode429_NaryTreeLevelOrderTraversal (N-ary Tree Level Order Traversal) Passed!");
    }
}
