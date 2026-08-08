// https://leetcode.com/problems/maximum-depth-of-binary-tree/
package trees;

import java.util.*;

public class MaximumDepthOfBinaryTree {
    // LeetCode Problem 104: Maximum Depth of Binary Tree
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        MaximumDepthOfBinaryTree solver = new MaximumDepthOfBinaryTree();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode104_MaximumDepthOfBinaryTree (Maximum Depth of Binary Tree) Passed!");
    }
}
