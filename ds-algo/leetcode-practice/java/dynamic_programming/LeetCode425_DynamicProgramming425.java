// https://leetcode.com/problems/dynamic-programming-memo-425/
package dynamic_programming;

import java.util.*;

public class LeetCode425_DynamicProgramming425 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode425_DynamicProgramming425 solver = new LeetCode425_DynamicProgramming425();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode425_DynamicProgramming425 Passed!");
    }
}
