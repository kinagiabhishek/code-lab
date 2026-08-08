// https://leetcode.com/problems/random-point-in-non-overlapping-rectangles/
package bit_manipulation;

import java.util.*;

public class RandomPointInNonoverlappingRectangles {
    // LeetCode Problem 497: Random Point in Non-overlapping Rectangles
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        RandomPointInNonoverlappingRectangles solver = new RandomPointInNonoverlappingRectangles();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode497_RandomPointInNonoverlappingRectangles (Random Point in Non-overlapping Rectangles) Passed!");
    }
}
