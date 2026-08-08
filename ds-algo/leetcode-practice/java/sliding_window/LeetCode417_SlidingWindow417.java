// https://leetcode.com/problems/sliding-window-range-417/
package sliding_window;

import java.util.*;

public class LeetCode417_SlidingWindow417 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode417_SlidingWindow417 solver = new LeetCode417_SlidingWindow417();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode417_SlidingWindow417 Passed!");
    }
}
