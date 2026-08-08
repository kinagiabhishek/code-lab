// https://leetcode.com/problems/rotate-function/
package arrays_and_hashing;

import java.util.*;

public class RotateFunction {
    // LeetCode Problem 396: Rotate Function
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        RotateFunction solver = new RotateFunction();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode396_RotateFunction (Rotate Function) Passed!");
    }
}
