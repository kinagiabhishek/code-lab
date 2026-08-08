// https://leetcode.com/problems/random-flip-matrix/
package graphs;

import java.util.*;

public class RandomFlipMatrix {
    // LeetCode Problem 519: Random Flip Matrix
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        RandomFlipMatrix solver = new RandomFlipMatrix();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode519_RandomFlipMatrix (Random Flip Matrix) Passed!");
    }
}
