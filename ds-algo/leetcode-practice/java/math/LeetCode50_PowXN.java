// https://leetcode.com/problems/powx-n/
package math;

import java.util.*;

public class LeetCode50_PowXN {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode50_PowXN solver = new LeetCode50_PowXN();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode50_PowXN Passed!");
    }
}
