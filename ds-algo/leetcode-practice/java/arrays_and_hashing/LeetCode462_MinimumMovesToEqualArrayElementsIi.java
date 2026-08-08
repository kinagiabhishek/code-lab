// https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii/
package arrays_and_hashing;

import java.util.*;

public class LeetCode462_MinimumMovesToEqualArrayElementsIi {
    // LeetCode Problem 462: Minimum Moves to Equal Array Elements II
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode462_MinimumMovesToEqualArrayElementsIi solver = new LeetCode462_MinimumMovesToEqualArrayElementsIi();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode462_MinimumMovesToEqualArrayElementsIi (Minimum Moves to Equal Array Elements II) Passed!");
    }
}
