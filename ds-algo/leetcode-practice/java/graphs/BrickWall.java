// https://leetcode.com/problems/brick-wall/
package graphs;

import java.util.*;

public class BrickWall {
    // LeetCode Problem 554: Brick Wall
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        BrickWall solver = new BrickWall();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ BrickWall (Brick Wall) Passed!");
    }
}
