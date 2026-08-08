// https://leetcode.com/problems/two-pointer-pair-468/
package two_pointers;

import java.util.*;

public class LeetCode468_TwoPointers468 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode468_TwoPointers468 solver = new LeetCode468_TwoPointers468();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode468_TwoPointers468 Passed!");
    }
}
