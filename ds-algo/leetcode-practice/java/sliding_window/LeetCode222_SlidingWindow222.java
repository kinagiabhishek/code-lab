// https://leetcode.com/problems/sliding-window-range-222/
package sliding_window;

import java.util.*;

public class LeetCode222_SlidingWindow222 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode222_SlidingWindow222 solver = new LeetCode222_SlidingWindow222();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode222_SlidingWindow222 Passed!");
    }
}
