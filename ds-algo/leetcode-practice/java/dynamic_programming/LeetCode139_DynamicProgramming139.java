// https://leetcode.com/problems/dynamic-programming-memo-139/
package dynamic_programming;

import java.util.*;

public class LeetCode139_DynamicProgramming139 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode139_DynamicProgramming139 solver = new LeetCode139_DynamicProgramming139();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode139_DynamicProgramming139 Passed!");
    }
}
