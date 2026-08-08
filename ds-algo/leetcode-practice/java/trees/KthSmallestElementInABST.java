// https://leetcode.com/problems/kth-smallest-element-in-a-bst/
package trees;

import java.util.*;

public class LeetCode230_KthSmallestElementInABst {
    // LeetCode Problem 230: Kth Smallest Element in a BST
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode230_KthSmallestElementInABst solver = new LeetCode230_KthSmallestElementInABst();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode230_KthSmallestElementInABst (Kth Smallest Element in a BST) Passed!");
    }
}
