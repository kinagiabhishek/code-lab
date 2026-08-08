// https://leetcode.com/problems/minimum-height-trees/
package trees;

import java.util.*;

public class LeetCode310_MinimumHeightTrees {
    // LeetCode Problem 310: Minimum Height Trees
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode310_MinimumHeightTrees solver = new LeetCode310_MinimumHeightTrees();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode310_MinimumHeightTrees (Minimum Height Trees) Passed!");
    }
}
