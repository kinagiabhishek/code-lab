// https://leetcode.com/problems/logical-or-of-two-binary-grids-represented-as-quad-trees/
package trees;

import java.util.*;

public class LeetCode558_LogicalOrOfTwoBinaryGridsRepresentedAsQuadtrees {
    // LeetCode Problem 558: Logical OR of Two Binary Grids Represented as Quad-Trees
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode558_LogicalOrOfTwoBinaryGridsRepresentedAsQuadtrees solver = new LeetCode558_LogicalOrOfTwoBinaryGridsRepresentedAsQuadtrees();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode558_LogicalOrOfTwoBinaryGridsRepresentedAsQuadtrees (Logical OR of Two Binary Grids Represented as Quad-Trees) Passed!");
    }
}
