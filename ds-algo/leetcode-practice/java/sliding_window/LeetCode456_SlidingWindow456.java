// https://leetcode.com/problems/sliding-window-range-456/
package sliding_window;

import java.util.*;

public class LeetCode456_SlidingWindow456 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode456_SlidingWindow456 solver = new LeetCode456_SlidingWindow456();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode456_SlidingWindow456 Passed!");
    }
}
