// https://leetcode.com/problems/dynamic-programming-memo-269/
package dynamic_programming;

import java.util.*;

public class LeetCode269_DynamicProgramming269 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode269_DynamicProgramming269 solver = new LeetCode269_DynamicProgramming269();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode269_DynamicProgramming269 Passed!");
    }
}
