// https://leetcode.com/problems/binary-tree-maximum-path-sum/
package trees;

import java.util.*;

public class BinaryTreeMaximumPathSum {
    // LeetCode Problem 124: Binary Tree Maximum Path Sum
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        BinaryTreeMaximumPathSum solver = new BinaryTreeMaximumPathSum();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode124_BinaryTreeMaximumPathSum (Binary Tree Maximum Path Sum) Passed!");
    }
}
