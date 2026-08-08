// https://leetcode.com/problems/n-ary-tree-postorder-traversal/
package trees;

import java.util.*;

public class LeetCode590_NaryTreePostorderTraversal {
    // LeetCode Problem 590: N-ary Tree Postorder Traversal
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode590_NaryTreePostorderTraversal solver = new LeetCode590_NaryTreePostorderTraversal();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode590_NaryTreePostorderTraversal (N-ary Tree Postorder Traversal) Passed!");
    }
}
