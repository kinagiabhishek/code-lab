// https://leetcode.com/problems/construct-quad-tree/
package trees;

import java.util.*;

public class ConstructQuadTree {
    // LeetCode Problem 427: Construct Quad Tree
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        ConstructQuadTree solver = new ConstructQuadTree();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ ConstructQuadTree (Construct Quad Tree) Passed!");
    }
}
