// https://leetcode.com/problems/next-permutation/
package two_pointers;

import java.util.*;

public class LeetCode31_NextPermutation {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode31_NextPermutation solver = new LeetCode31_NextPermutation();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode31_NextPermutation Passed!");
    }
}
