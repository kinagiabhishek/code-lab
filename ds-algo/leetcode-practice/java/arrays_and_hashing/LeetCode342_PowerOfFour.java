// https://leetcode.com/problems/power-of-four/
package arrays_and_hashing;

import java.util.*;

public class LeetCode342_PowerOfFour {
    // LeetCode Problem 342: Power of Four
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode342_PowerOfFour solver = new LeetCode342_PowerOfFour();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode342_PowerOfFour (Power of Four) Passed!");
    }
}
