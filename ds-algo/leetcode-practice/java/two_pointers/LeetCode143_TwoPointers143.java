// https://leetcode.com/problems/two-pointer-pair-143/
package two_pointers;

import java.util.*;

public class LeetCode143_TwoPointers143 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode143_TwoPointers143 solver = new LeetCode143_TwoPointers143();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode143_TwoPointers143 Passed!");
    }
}
