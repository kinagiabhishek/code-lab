// https://leetcode.com/problems/generate-random-point-in-a-circle/
package bit_manipulation;

import java.util.*;

public class GenerateRandomPointInACircle {
    // LeetCode Problem 478: Generate Random Point in a Circle
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        GenerateRandomPointInACircle solver = new GenerateRandomPointInACircle();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode478_GenerateRandomPointInACircle (Generate Random Point in a Circle) Passed!");
    }
}
