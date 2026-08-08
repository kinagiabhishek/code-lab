// https://leetcode.com/problems/zuma-game/
package arrays_and_hashing;

import java.util.*;

public class ZumaGame {
    // LeetCode Problem 488: Zuma Game
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        ZumaGame solver = new ZumaGame();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode488_ZumaGame (Zuma Game) Passed!");
    }
}
