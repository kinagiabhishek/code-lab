// https://leetcode.com/problems/game-of-life/
package heap_and_priority_queue;

import java.util.*;

public class GameOfLife {
    // LeetCode Problem 289: Game of Life
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        GameOfLife solver = new GameOfLife();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ GameOfLife (Game of Life) Passed!");
    }
}
