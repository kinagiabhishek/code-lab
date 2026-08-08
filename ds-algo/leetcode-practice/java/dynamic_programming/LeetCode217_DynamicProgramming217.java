// https://leetcode.com/problems/dynamic-programming-memo-217/
package dynamic_programming;

import java.util.*;

public class LeetCode217_DynamicProgramming217 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode217_DynamicProgramming217 solver = new LeetCode217_DynamicProgramming217();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode217_DynamicProgramming217 Passed!");
    }
}
