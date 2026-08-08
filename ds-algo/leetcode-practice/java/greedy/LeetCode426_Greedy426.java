// https://leetcode.com/problems/greedy-choice-426/
package greedy;

import java.util.*;

public class LeetCode426_Greedy426 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode426_Greedy426 solver = new LeetCode426_Greedy426();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode426_Greedy426 Passed!");
    }
}
