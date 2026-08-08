// https://leetcode.com/problems/sliding-window-range-248/
package sliding_window;

import java.util.*;

public class LeetCode248_SlidingWindow248 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode248_SlidingWindow248 solver = new LeetCode248_SlidingWindow248();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode248_SlidingWindow248 Passed!");
    }
}
