// https://leetcode.com/problems/two-pointer-pair-169/
package two_pointers;

import java.util.*;

public class LeetCode169_TwoPointers169 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode169_TwoPointers169 solver = new LeetCode169_TwoPointers169();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode169_TwoPointers169 Passed!");
    }
}
