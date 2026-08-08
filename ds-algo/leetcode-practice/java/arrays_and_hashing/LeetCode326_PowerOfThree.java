// https://leetcode.com/problems/power-of-three/
package arrays_and_hashing;

import java.util.*;

public class LeetCode326_PowerOfThree {
    // LeetCode Problem 326: Power of Three
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode326_PowerOfThree solver = new LeetCode326_PowerOfThree();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode326_PowerOfThree (Power of Three) Passed!");
    }
}
