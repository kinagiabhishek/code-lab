// https://leetcode.com/problems/sliding-window-range-495/
package sliding_window;

import java.util.*;

public class LeetCode495_SlidingWindow495 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode495_SlidingWindow495 solver = new LeetCode495_SlidingWindow495();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode495_SlidingWindow495 Passed!");
    }
}
