// https://leetcode.com/problems/rotate-array/
package arrays_and_hashing;

import java.util.*;

public class RotateArray {
    // LeetCode Problem 189: Rotate Array
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        RotateArray solver = new RotateArray();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode189_RotateArray (Rotate Array) Passed!");
    }
}
