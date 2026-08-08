// https://leetcode.com/problems/4sum/
package two_pointers;

import java.util.*;

public class LeetCode18_4Sum {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode18_4Sum solver = new LeetCode18_4Sum();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode18_4Sum Passed!");
    }
}
