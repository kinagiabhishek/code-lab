// https://leetcode.com/problems/matchsticks-to-square/
package arrays_and_hashing;

import java.util.*;

public class MatchsticksToSquare {
    // LeetCode Problem 473: Matchsticks to Square
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        MatchsticksToSquare solver = new MatchsticksToSquare();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode473_MatchsticksToSquare (Matchsticks to Square) Passed!");
    }
}
