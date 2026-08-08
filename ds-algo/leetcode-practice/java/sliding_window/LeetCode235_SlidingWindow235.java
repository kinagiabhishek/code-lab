// https://leetcode.com/problems/sliding-window-range-235/
package sliding_window;

import java.util.*;

public class LeetCode235_SlidingWindow235 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode235_SlidingWindow235 solver = new LeetCode235_SlidingWindow235();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode235_SlidingWindow235 Passed!");
    }
}
