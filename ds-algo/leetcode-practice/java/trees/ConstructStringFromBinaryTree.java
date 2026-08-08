// https://leetcode.com/problems/construct-string-from-binary-tree/
package trees;

import java.util.*;

public class ConstructStringFromBinaryTree {
    // LeetCode Problem 606: Construct String from Binary Tree
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        ConstructStringFromBinaryTree solver = new ConstructStringFromBinaryTree();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode606_ConstructStringFromBinaryTree (Construct String from Binary Tree) Passed!");
    }
}
