// https://leetcode.com/problems/two-pointer-pair-182/
package two_pointers;

import java.util.*;

public class LeetCode182_TwoPointers182 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode182_TwoPointers182 solver = new LeetCode182_TwoPointers182();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode182_TwoPointers182 Passed!");
    }
}
