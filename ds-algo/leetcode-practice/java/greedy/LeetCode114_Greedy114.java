// https://leetcode.com/problems/greedy-choice-114/
package greedy;

import java.util.*;

public class LeetCode114_Greedy114 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode114_Greedy114 solver = new LeetCode114_Greedy114();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode114_Greedy114 Passed!");
    }
}
