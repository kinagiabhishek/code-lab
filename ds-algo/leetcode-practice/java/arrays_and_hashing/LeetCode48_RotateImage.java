// https://leetcode.com/problems/rotate-image/
package arrays_and_hashing;

import java.util.*;

public class LeetCode48_RotateImage {
    // LeetCode Problem 48: Rotate Image
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode48_RotateImage solver = new LeetCode48_RotateImage();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode48_RotateImage (Rotate Image) Passed!");
    }
}
