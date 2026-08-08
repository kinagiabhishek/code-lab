// https://leetcode.com/problems/greedy-choice-452/
package greedy;

import java.util.*;

public class LeetCode452_Greedy452 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode452_Greedy452 solver = new LeetCode452_Greedy452();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode452_Greedy452 Passed!");
    }
}
