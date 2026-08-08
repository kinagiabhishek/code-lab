// https://leetcode.com/problems/two-pointer-pair-234/
package two_pointers;

import java.util.*;

public class LeetCode234_TwoPointers234 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode234_TwoPointers234 solver = new LeetCode234_TwoPointers234();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode234_TwoPointers234 Passed!");
    }
}
