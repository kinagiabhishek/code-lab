// https://leetcode.com/problems/sliding-window-range-118/
package sliding_window;

import java.util.*;

public class LeetCode118_SlidingWindow118 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode118_SlidingWindow118 solver = new LeetCode118_SlidingWindow118();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode118_SlidingWindow118 Passed!");
    }
}
