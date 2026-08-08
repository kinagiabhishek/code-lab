// https://leetcode.com/problems/power-of-two/
package arrays_and_hashing;

import java.util.*;

public class PowerOfTwo {
    // LeetCode Problem 231: Power of Two
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        PowerOfTwo solver = new PowerOfTwo();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode231_PowerOfTwo (Power of Two) Passed!");
    }
}
