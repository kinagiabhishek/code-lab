// https://leetcode.com/problems/two-pointer-pair-91/
package two_pointers;

import java.util.*;

public class LeetCode91_TwoPointers91 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode91_TwoPointers91 solver = new LeetCode91_TwoPointers91();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode91_TwoPointers91 Passed!");
    }
}
