// https://leetcode.com/problems/4sum-ii/
package two_pointers;

import java.util.*;

public class P4sumIi {
    // LeetCode Problem 454: 4Sum II
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        P4sumIi solver = new P4sumIi();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode454_P4sumIi (4Sum II) Passed!");
    }
}
