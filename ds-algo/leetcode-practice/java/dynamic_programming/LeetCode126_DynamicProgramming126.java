// https://leetcode.com/problems/dynamic-programming-memo-126/
package dynamic_programming;

import java.util.*;

public class LeetCode126_DynamicProgramming126 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode126_DynamicProgramming126 solver = new LeetCode126_DynamicProgramming126();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode126_DynamicProgramming126 Passed!");
    }
}
