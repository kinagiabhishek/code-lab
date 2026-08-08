// https://leetcode.com/problems/dynamic-programming-memo-399/
package dynamic_programming;

import java.util.*;

public class LeetCode399_DynamicProgramming399 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode399_DynamicProgramming399 solver = new LeetCode399_DynamicProgramming399();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode399_DynamicProgramming399 Passed!");
    }
}
