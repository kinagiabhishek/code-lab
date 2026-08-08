// https://leetcode.com/problems/dynamic-programming-memo-347/
package dynamic_programming;

import java.util.*;

public class LeetCode347_DynamicProgramming347 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode347_DynamicProgramming347 solver = new LeetCode347_DynamicProgramming347();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode347_DynamicProgramming347 Passed!");
    }
}
