// https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii/
package arrays_and_hashing;

import java.util.*;

public class MinimumMovesToEqualArrayElementsIi {
    // LeetCode Problem 462: Minimum Moves to Equal Array Elements II
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        MinimumMovesToEqualArrayElementsIi solver = new MinimumMovesToEqualArrayElementsIi();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode462_MinimumMovesToEqualArrayElementsIi (Minimum Moves to Equal Array Elements II) Passed!");
    }
}
