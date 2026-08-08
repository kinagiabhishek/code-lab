// https://leetcode.com/problems/greedy-choice-205/
package greedy;

import java.util.*;

public class LeetCode205_Greedy205 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode205_Greedy205 solver = new LeetCode205_Greedy205();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode205_Greedy205 Passed!");
    }
}
