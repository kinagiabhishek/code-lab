// https://leetcode.com/problems/dynamic-programming-memo-308/
package dynamic_programming;

import java.util.*;

public class LeetCode308_DynamicProgramming308 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode308_DynamicProgramming308 solver = new LeetCode308_DynamicProgramming308();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode308_DynamicProgramming308 Passed!");
    }
}
