// https://leetcode.com/problems/two-pointer-pair-416/
package two_pointers;

import java.util.*;

public class LeetCode416_TwoPointers416 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode416_TwoPointers416 solver = new LeetCode416_TwoPointers416();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode416_TwoPointers416 Passed!");
    }
}
