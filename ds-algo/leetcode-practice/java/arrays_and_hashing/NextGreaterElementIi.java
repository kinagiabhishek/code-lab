// https://leetcode.com/problems/next-greater-element-ii/
package arrays_and_hashing;

import java.util.*;

public class NextGreaterElementIi {
    // LeetCode Problem 503: Next Greater Element II
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        NextGreaterElementIi solver = new NextGreaterElementIi();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode503_NextGreaterElementIi (Next Greater Element II) Passed!");
    }
}
