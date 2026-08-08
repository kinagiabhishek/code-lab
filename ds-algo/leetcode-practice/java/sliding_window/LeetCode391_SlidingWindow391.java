// https://leetcode.com/problems/sliding-window-range-391/
package sliding_window;

import java.util.*;

public class LeetCode391_SlidingWindow391 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode391_SlidingWindow391 solver = new LeetCode391_SlidingWindow391();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode391_SlidingWindow391 Passed!");
    }
}
