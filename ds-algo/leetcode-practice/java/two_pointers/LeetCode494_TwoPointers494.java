// https://leetcode.com/problems/two-pointer-pair-494/
package two_pointers;

import java.util.*;

public class LeetCode494_TwoPointers494 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode494_TwoPointers494 solver = new LeetCode494_TwoPointers494();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode494_TwoPointers494 Passed!");
    }
}
