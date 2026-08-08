// https://leetcode.com/problems/sliding-window-range-365/
package sliding_window;

import java.util.*;

public class LeetCode365_SlidingWindow365 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode365_SlidingWindow365 solver = new LeetCode365_SlidingWindow365();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode365_SlidingWindow365 Passed!");
    }
}
