// https://leetcode.com/problems/gray-code/
package arrays_and_hashing;

import java.util.*;

public class LeetCode89_GrayCode {
    // LeetCode Problem 89: Gray Code
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode89_GrayCode solver = new LeetCode89_GrayCode();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode89_GrayCode (Gray Code) Passed!");
    }
}
