// https://leetcode.com/problems/greedy-choice-517/
package greedy;

import java.util.*;

public class LeetCode517_Greedy517 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode517_Greedy517 solver = new LeetCode517_Greedy517();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode517_Greedy517 Passed!");
    }
}
