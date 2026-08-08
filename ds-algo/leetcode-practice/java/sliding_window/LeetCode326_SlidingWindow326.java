// https://leetcode.com/problems/sliding-window-range-326/
package sliding_window;

import java.util.*;

public class LeetCode326_SlidingWindow326 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode326_SlidingWindow326 solver = new LeetCode326_SlidingWindow326();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode326_SlidingWindow326 Passed!");
    }
}
