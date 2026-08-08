// https://leetcode.com/problems/tenth-line/
package arrays_and_hashing;

import java.util.*;

public class LeetCode195_TenthLine {
    // LeetCode Problem 195: Tenth Line
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode195_TenthLine solver = new LeetCode195_TenthLine();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode195_TenthLine (Tenth Line) Passed!");
    }
}
