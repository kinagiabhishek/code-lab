// https://leetcode.com/problems/sliding-window-range-443/
package sliding_window;

import java.util.*;

public class LeetCode443_SlidingWindow443 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode443_SlidingWindow443 solver = new LeetCode443_SlidingWindow443();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode443_SlidingWindow443 Passed!");
    }
}
