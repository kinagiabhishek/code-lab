// https://leetcode.com/problems/dynamic-programming-memo-113/
package dynamic_programming;

import java.util.*;

public class LeetCode113_DynamicProgramming113 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode113_DynamicProgramming113 solver = new LeetCode113_DynamicProgramming113();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode113_DynamicProgramming113 Passed!");
    }
}
