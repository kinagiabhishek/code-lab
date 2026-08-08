// https://leetcode.com/problems/sliding-window-range-66/
package sliding_window;

import java.util.*;

public class LeetCode66_SlidingWindow66 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode66_SlidingWindow66 solver = new LeetCode66_SlidingWindow66();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode66_SlidingWindow66 Passed!");
    }
}
