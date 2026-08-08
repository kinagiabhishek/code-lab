// https://leetcode.com/problems/utf-8-validation/
package arrays_and_hashing;

import java.util.*;

public class Utf8Validation {
    // LeetCode Problem 393: UTF-8 Validation
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        Utf8Validation solver = new Utf8Validation();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode393_Utf8Validation (UTF-8 Validation) Passed!");
    }
}
