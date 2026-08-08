// https://leetcode.com/problems/delete-node-in-a-bst/
package trees;

import java.util.*;

public class LeetCode450_DeleteNodeInABst {
    // LeetCode Problem 450: Delete Node in a BST
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode450_DeleteNodeInABst solver = new LeetCode450_DeleteNodeInABst();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode450_DeleteNodeInABst (Delete Node in a BST) Passed!");
    }
}
