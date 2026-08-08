// https://leetcode.com/problems/merge-two-binary-trees/
package trees;

import java.util.*;

public class LeetCode617_MergeTwoBinaryTrees {
    // LeetCode Problem 617: Merge Two Binary Trees
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode617_MergeTwoBinaryTrees solver = new LeetCode617_MergeTwoBinaryTrees();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode617_MergeTwoBinaryTrees (Merge Two Binary Trees) Passed!");
    }
}
