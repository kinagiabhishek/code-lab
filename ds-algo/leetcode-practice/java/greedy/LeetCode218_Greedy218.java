// https://leetcode.com/problems/greedy-choice-218/
package greedy;

import java.util.*;

public class LeetCode218_Greedy218 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode218_Greedy218 solver = new LeetCode218_Greedy218();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode218_Greedy218 Passed!");
    }
}
