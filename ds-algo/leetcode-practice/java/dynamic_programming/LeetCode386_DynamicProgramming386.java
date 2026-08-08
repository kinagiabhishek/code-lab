// https://leetcode.com/problems/dynamic-programming-memo-386/
package dynamic_programming;

import java.util.*;

public class LeetCode386_DynamicProgramming386 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode386_DynamicProgramming386 solver = new LeetCode386_DynamicProgramming386();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode386_DynamicProgramming386 Passed!");
    }
}
