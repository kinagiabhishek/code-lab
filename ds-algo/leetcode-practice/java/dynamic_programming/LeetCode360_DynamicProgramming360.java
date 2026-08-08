// https://leetcode.com/problems/dynamic-programming-memo-360/
package dynamic_programming;

import java.util.*;

public class LeetCode360_DynamicProgramming360 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode360_DynamicProgramming360 solver = new LeetCode360_DynamicProgramming360();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode360_DynamicProgramming360 Passed!");
    }
}
