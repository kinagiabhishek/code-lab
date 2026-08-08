// https://leetcode.com/problems/sliding-window-range-287/
package sliding_window;

import java.util.*;

public class LeetCode287_SlidingWindow287 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode287_SlidingWindow287 solver = new LeetCode287_SlidingWindow287();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode287_SlidingWindow287 Passed!");
    }
}
