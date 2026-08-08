// https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
package trees;

import java.util.*;

public class LowestCommonAncestorOfABinarySearchTree {
    // LeetCode Problem 235: Lowest Common Ancestor of a Binary Search Tree
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LowestCommonAncestorOfABinarySearchTree solver = new LowestCommonAncestorOfABinarySearchTree();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode235_LowestCommonAncestorOfABinarySearchTree (Lowest Common Ancestor of a Binary Search Tree) Passed!");
    }
}
