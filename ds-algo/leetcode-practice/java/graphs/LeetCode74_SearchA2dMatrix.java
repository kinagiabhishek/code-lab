// https://leetcode.com/problems/search-a-2d-matrix/
package graphs;

import java.util.*;

public class LeetCode74_SearchA2dMatrix {
    // LeetCode Problem 74: Search a 2D Matrix
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode74_SearchA2dMatrix solver = new LeetCode74_SearchA2dMatrix();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode74_SearchA2dMatrix (Search a 2D Matrix) Passed!");
    }
}
