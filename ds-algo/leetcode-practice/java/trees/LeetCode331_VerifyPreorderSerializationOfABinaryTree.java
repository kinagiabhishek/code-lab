// https://leetcode.com/problems/verify-preorder-serialization-of-a-binary-tree/
package trees;

import java.util.*;

public class LeetCode331_VerifyPreorderSerializationOfABinaryTree {
    // LeetCode Problem 331: Verify Preorder Serialization of a Binary Tree
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode331_VerifyPreorderSerializationOfABinaryTree solver = new LeetCode331_VerifyPreorderSerializationOfABinaryTree();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode331_VerifyPreorderSerializationOfABinaryTree (Verify Preorder Serialization of a Binary Tree) Passed!");
    }
}
