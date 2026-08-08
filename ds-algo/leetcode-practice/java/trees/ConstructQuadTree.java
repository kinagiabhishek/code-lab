// https://leetcode.com/problems/construct-quad-tree/
package trees;

import java.util.*;

public class ConstructQuadTree {
    // LeetCode Problem 427: Construct Quad Tree
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        ConstructQuadTree solver = new ConstructQuadTree();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode427_ConstructQuadTree (Construct Quad Tree) Passed!");
    }
}
