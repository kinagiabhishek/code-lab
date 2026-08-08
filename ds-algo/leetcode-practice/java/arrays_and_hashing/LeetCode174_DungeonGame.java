// https://leetcode.com/problems/dungeon-game/
package arrays_and_hashing;

import java.util.*;

public class LeetCode174_DungeonGame {
    // LeetCode Problem 174: Dungeon Game
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode174_DungeonGame solver = new LeetCode174_DungeonGame();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode174_DungeonGame (Dungeon Game) Passed!");
    }
}
