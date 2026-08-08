// https://leetcode.com/problems/two-pointer-pair-429/
package two_pointers;

import java.util.*;

public class LeetCode429_TwoPointers429 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode429_TwoPointers429 solver = new LeetCode429_TwoPointers429();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode429_TwoPointers429 Passed!");
    }
}
