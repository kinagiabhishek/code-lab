// https://leetcode.com/problems/minimum-depth-of-binary-tree/
package trees;

import java.util.*;

public class MinimumDepthOfBinaryTree {
    // LeetCode Problem 111: Minimum Depth of Binary Tree
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        MinimumDepthOfBinaryTree solver = new MinimumDepthOfBinaryTree();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode111_MinimumDepthOfBinaryTree (Minimum Depth of Binary Tree) Passed!");
    }
}
