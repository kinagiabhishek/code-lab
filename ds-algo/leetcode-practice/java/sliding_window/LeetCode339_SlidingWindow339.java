// https://leetcode.com/problems/sliding-window-range-339/
package sliding_window;

import java.util.*;

public class LeetCode339_SlidingWindow339 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode339_SlidingWindow339 solver = new LeetCode339_SlidingWindow339();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode339_SlidingWindow339 Passed!");
    }
}
