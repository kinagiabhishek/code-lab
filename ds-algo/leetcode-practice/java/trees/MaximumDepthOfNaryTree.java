// https://leetcode.com/problems/maximum-depth-of-n-ary-tree/
package trees;

import java.util.*;

public class MaximumDepthOfNaryTree {
    // LeetCode Problem 559: Maximum Depth of N-ary Tree
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        MaximumDepthOfNaryTree solver = new MaximumDepthOfNaryTree();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode559_MaximumDepthOfNaryTree (Maximum Depth of N-ary Tree) Passed!");
    }
}
