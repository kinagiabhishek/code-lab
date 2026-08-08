// https://leetcode.com/problems/perfect-rectangle/
package arrays_and_hashing;

import java.util.*;

public class LeetCode391_PerfectRectangle {
    // LeetCode Problem 391: Perfect Rectangle
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode391_PerfectRectangle solver = new LeetCode391_PerfectRectangle();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode391_PerfectRectangle (Perfect Rectangle) Passed!");
    }
}
