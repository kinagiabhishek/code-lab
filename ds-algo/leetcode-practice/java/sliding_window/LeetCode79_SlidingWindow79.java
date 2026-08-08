// https://leetcode.com/problems/sliding-window-range-79/
package sliding_window;

import java.util.*;

public class LeetCode79_SlidingWindow79 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode79_SlidingWindow79 solver = new LeetCode79_SlidingWindow79();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode79_SlidingWindow79 Passed!");
    }
}
