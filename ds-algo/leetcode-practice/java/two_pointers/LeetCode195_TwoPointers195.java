// https://leetcode.com/problems/two-pointer-pair-195/
package two_pointers;

import java.util.*;

public class LeetCode195_TwoPointers195 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode195_TwoPointers195 solver = new LeetCode195_TwoPointers195();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode195_TwoPointers195 Passed!");
    }
}
