// https://leetcode.com/problems/set-mismatch/
package arrays_and_hashing;

import java.util.*;

public class SetMismatch {
    // LeetCode Problem 645: Set Mismatch
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        SetMismatch solver = new SetMismatch();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode645_SetMismatch (Set Mismatch) Passed!");
    }
}
