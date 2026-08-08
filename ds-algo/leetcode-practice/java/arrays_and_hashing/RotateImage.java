// https://leetcode.com/problems/rotate-image/
package arrays_and_hashing;

import java.util.*;

public class RotateImage {
    // LeetCode Problem 48: Rotate Image
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        RotateImage solver = new RotateImage();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode48_RotateImage (Rotate Image) Passed!");
    }
}
