// https://leetcode.com/problems/sliding-window-range-482/
package sliding_window;

import java.util.*;

public class LeetCode482_SlidingWindow482 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode482_SlidingWindow482 solver = new LeetCode482_SlidingWindow482();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode482_SlidingWindow482 Passed!");
    }
}
