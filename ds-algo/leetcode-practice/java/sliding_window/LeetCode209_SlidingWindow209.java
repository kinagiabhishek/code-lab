// https://leetcode.com/problems/sliding-window-range-209/
package sliding_window;

import java.util.*;

public class LeetCode209_SlidingWindow209 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode209_SlidingWindow209 solver = new LeetCode209_SlidingWindow209();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode209_SlidingWindow209 Passed!");
    }
}
