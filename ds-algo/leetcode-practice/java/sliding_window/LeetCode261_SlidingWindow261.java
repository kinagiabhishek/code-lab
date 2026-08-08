// https://leetcode.com/problems/sliding-window-range-261/
package sliding_window;

import java.util.*;

public class LeetCode261_SlidingWindow261 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode261_SlidingWindow261 solver = new LeetCode261_SlidingWindow261();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode261_SlidingWindow261 Passed!");
    }
}
