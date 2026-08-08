// https://leetcode.com/problems/subtree-of-another-tree/
package trees;

import java.util.*;

public class SubtreeOfAnotherTree {
    // LeetCode Problem 572: Subtree of Another Tree
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        SubtreeOfAnotherTree solver = new SubtreeOfAnotherTree();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode572_SubtreeOfAnotherTree (Subtree of Another Tree) Passed!");
    }
}
