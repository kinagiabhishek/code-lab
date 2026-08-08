// https://leetcode.com/problems/greedy-choice-231/
package greedy;

import java.util.*;

public class LeetCode231_Greedy231 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode231_Greedy231 solver = new LeetCode231_Greedy231();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode231_Greedy231 Passed!");
    }
}
