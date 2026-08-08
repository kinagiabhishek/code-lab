// https://leetcode.com/problems/two-pointer-pair-299/
package two_pointers;

import java.util.*;

public class LeetCode299_TwoPointers299 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode299_TwoPointers299 solver = new LeetCode299_TwoPointers299();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode299_TwoPointers299 Passed!");
    }
}
