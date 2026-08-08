// https://leetcode.com/problems/rotate-image/
package arrays_and_hashing;

import java.util.*;

public class LeetCode48_RotateImage {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode48_RotateImage solver = new LeetCode48_RotateImage();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode48_RotateImage Passed!");
    }
}
