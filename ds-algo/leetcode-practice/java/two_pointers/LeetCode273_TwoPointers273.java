// https://leetcode.com/problems/two-pointer-pair-273/
package two_pointers;

import java.util.*;

public class LeetCode273_TwoPointers273 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode273_TwoPointers273 solver = new LeetCode273_TwoPointers273();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode273_TwoPointers273 Passed!");
    }
}
