// https://leetcode.com/problems/sliding-window-range-183/
package sliding_window;

import java.util.*;

public class LeetCode183_SlidingWindow183 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode183_SlidingWindow183 solver = new LeetCode183_SlidingWindow183();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode183_SlidingWindow183 Passed!");
    }
}
