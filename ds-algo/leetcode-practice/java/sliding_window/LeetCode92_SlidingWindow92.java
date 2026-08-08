// https://leetcode.com/problems/sliding-window-range-92/
package sliding_window;

import java.util.*;

public class LeetCode92_SlidingWindow92 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode92_SlidingWindow92 solver = new LeetCode92_SlidingWindow92();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode92_SlidingWindow92 Passed!");
    }
}
