// https://leetcode.com/problems/dynamic-programming-memo-321/
package dynamic_programming;

import java.util.*;

public class LeetCode321_DynamicProgramming321 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode321_DynamicProgramming321 solver = new LeetCode321_DynamicProgramming321();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode321_DynamicProgramming321 Passed!");
    }
}
