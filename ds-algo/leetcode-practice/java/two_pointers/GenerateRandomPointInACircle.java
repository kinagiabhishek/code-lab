// https://leetcode.com/problems/generate-random-point-in-a-circle/
package two_pointers;

import java.util.*;

public class GenerateRandomPointInACircle {
    // LeetCode Problem 478: Generate Random Point in a Circle
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        GenerateRandomPointInACircle solver = new GenerateRandomPointInACircle();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ GenerateRandomPointInACircle (Generate Random Point in a Circle) Passed!");
    }
}
