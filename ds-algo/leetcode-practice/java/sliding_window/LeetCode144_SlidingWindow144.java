// https://leetcode.com/problems/sliding-window-range-144/
package sliding_window;

import java.util.*;

public class LeetCode144_SlidingWindow144 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode144_SlidingWindow144 solver = new LeetCode144_SlidingWindow144();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode144_SlidingWindow144 Passed!");
    }
}
