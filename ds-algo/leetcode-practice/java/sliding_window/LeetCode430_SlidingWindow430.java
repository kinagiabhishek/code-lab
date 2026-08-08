// https://leetcode.com/problems/sliding-window-range-430/
package sliding_window;

import java.util.*;

public class LeetCode430_SlidingWindow430 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode430_SlidingWindow430 solver = new LeetCode430_SlidingWindow430();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode430_SlidingWindow430 Passed!");
    }
}
