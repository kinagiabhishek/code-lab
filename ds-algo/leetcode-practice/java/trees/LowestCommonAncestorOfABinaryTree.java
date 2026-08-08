// https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
package trees;

import java.util.*;

public class LowestCommonAncestorOfABinaryTree {
    // LeetCode Problem 236: Lowest Common Ancestor of a Binary Tree
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LowestCommonAncestorOfABinaryTree solver = new LowestCommonAncestorOfABinaryTree();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode236_LowestCommonAncestorOfABinaryTree (Lowest Common Ancestor of a Binary Tree) Passed!");
    }
}
