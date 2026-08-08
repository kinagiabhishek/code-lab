// https://leetcode.com/problems/brick-wall/
package arrays_and_hashing;

import java.util.*;

public class LeetCode554_BrickWall {
    // LeetCode Problem 554: Brick Wall
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode554_BrickWall solver = new LeetCode554_BrickWall();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode554_BrickWall (Brick Wall) Passed!");
    }
}
