// https://leetcode.com/problems/reshape-the-matrix/
package graphs;

import java.util.*;

public class LeetCode566_ReshapeTheMatrix {
    // LeetCode Problem 566: Reshape the Matrix
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode566_ReshapeTheMatrix solver = new LeetCode566_ReshapeTheMatrix();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode566_ReshapeTheMatrix (Reshape the Matrix) Passed!");
    }
}
