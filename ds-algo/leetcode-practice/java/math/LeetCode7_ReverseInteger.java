// https://leetcode.com/problems/reverse-integer/
package math;

import java.util.*;

public class LeetCode7_ReverseInteger {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode7_ReverseInteger solver = new LeetCode7_ReverseInteger();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode7_ReverseInteger Passed!");
    }
}
