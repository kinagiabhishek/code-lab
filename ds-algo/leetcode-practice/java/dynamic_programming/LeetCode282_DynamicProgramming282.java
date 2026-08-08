// https://leetcode.com/problems/dynamic-programming-memo-282/
package dynamic_programming;

import java.util.*;

public class LeetCode282_DynamicProgramming282 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode282_DynamicProgramming282 solver = new LeetCode282_DynamicProgramming282();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode282_DynamicProgramming282 Passed!");
    }
}
