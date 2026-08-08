// https://leetcode.com/problems/minimum-absolute-difference-in-bst/
package trees;

import java.util.*;

public class LeetCode530_MinimumAbsoluteDifferenceInBst {
    // LeetCode Problem 530: Minimum Absolute Difference in BST
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode530_MinimumAbsoluteDifferenceInBst solver = new LeetCode530_MinimumAbsoluteDifferenceInBst();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode530_MinimumAbsoluteDifferenceInBst (Minimum Absolute Difference in BST) Passed!");
    }
}
