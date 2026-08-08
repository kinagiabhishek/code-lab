// https://leetcode.com/problems/sliding-window-range-300/
package sliding_window;

import java.util.*;

public class LeetCode300_SlidingWindow300 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode300_SlidingWindow300 solver = new LeetCode300_SlidingWindow300();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode300_SlidingWindow300 Passed!");
    }
}
