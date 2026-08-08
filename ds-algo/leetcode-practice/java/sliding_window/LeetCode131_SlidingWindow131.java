// https://leetcode.com/problems/sliding-window-range-131/
package sliding_window;

import java.util.*;

public class LeetCode131_SlidingWindow131 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode131_SlidingWindow131 solver = new LeetCode131_SlidingWindow131();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode131_SlidingWindow131 Passed!");
    }
}
