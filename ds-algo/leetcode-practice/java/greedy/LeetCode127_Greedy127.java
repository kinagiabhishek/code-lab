// https://leetcode.com/problems/greedy-choice-127/
package greedy;

import java.util.*;

public class LeetCode127_Greedy127 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode127_Greedy127 solver = new LeetCode127_Greedy127();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode127_Greedy127 Passed!");
    }
}
