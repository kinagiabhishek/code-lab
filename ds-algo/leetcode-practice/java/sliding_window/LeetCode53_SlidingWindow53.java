// https://leetcode.com/problems/sliding-window-range-53/
package sliding_window;

import java.util.*;

public class LeetCode53_SlidingWindow53 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode53_SlidingWindow53 solver = new LeetCode53_SlidingWindow53();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode53_SlidingWindow53 Passed!");
    }
}
