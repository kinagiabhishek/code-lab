// https://leetcode.com/problems/two-pointer-pair-312/
package two_pointers;

import java.util.*;

public class LeetCode312_TwoPointers312 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode312_TwoPointers312 solver = new LeetCode312_TwoPointers312();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode312_TwoPointers312 Passed!");
    }
}
