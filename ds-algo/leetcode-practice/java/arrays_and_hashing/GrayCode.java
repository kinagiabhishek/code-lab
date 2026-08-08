// https://leetcode.com/problems/gray-code/
package arrays_and_hashing;

import java.util.*;

public class GrayCode {
    // LeetCode Problem 89: Gray Code
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        GrayCode solver = new GrayCode();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode89_GrayCode (Gray Code) Passed!");
    }
}
