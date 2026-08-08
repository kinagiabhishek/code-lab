// https://leetcode.com/problems/two-pointer-pair-377/
package two_pointers;

import java.util.*;

public class LeetCode377_TwoPointers377 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode377_TwoPointers377 solver = new LeetCode377_TwoPointers377();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode377_TwoPointers377 Passed!");
    }
}
