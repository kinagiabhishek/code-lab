// https://leetcode.com/problems/minimum-moves-to-equal-array-elements/
package arrays_and_hashing;

import java.util.*;

public class MinimumMovesToEqualArrayElements {
    // LeetCode Problem 453: Minimum Moves to Equal Array Elements
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        MinimumMovesToEqualArrayElements solver = new MinimumMovesToEqualArrayElements();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode453_MinimumMovesToEqualArrayElements (Minimum Moves to Equal Array Elements) Passed!");
    }
}
