// https://leetcode.com/problems/sliding-window-range-313/
package sliding_window;

import java.util.*;

public class LeetCode313_SlidingWindow313 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode313_SlidingWindow313 solver = new LeetCode313_SlidingWindow313();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode313_SlidingWindow313 Passed!");
    }
}
