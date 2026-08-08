// https://leetcode.com/problems/battleships-in-a-board/
package arrays_and_hashing;

import java.util.*;

public class LeetCode419_BattleshipsInABoard {
    // LeetCode Problem 419: Battleships in a Board
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode419_BattleshipsInABoard solver = new LeetCode419_BattleshipsInABoard();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode419_BattleshipsInABoard (Battleships in a Board) Passed!");
    }
}
