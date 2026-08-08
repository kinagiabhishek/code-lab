// https://leetcode.com/problems/greedy-choice-244/
package greedy;

import java.util.*;

public class LeetCode244_Greedy244 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode244_Greedy244 solver = new LeetCode244_Greedy244();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode244_Greedy244 Passed!");
    }
}
