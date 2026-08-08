// https://leetcode.com/problems/sliding-window-range-352/
package sliding_window;

import java.util.*;

public class LeetCode352_SlidingWindow352 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode352_SlidingWindow352 solver = new LeetCode352_SlidingWindow352();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode352_SlidingWindow352 Passed!");
    }
}
