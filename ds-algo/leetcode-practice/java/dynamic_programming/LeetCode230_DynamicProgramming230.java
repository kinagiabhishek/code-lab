// https://leetcode.com/problems/dynamic-programming-memo-230/
package dynamic_programming;

import java.util.*;

public class LeetCode230_DynamicProgramming230 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode230_DynamicProgramming230 solver = new LeetCode230_DynamicProgramming230();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode230_DynamicProgramming230 Passed!");
    }
}
