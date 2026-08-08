// https://leetcode.com/problems/two-pointer-pair-351/
package two_pointers;

import java.util.*;

public class LeetCode351_TwoPointers351 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode351_TwoPointers351 solver = new LeetCode351_TwoPointers351();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode351_TwoPointers351 Passed!");
    }
}
