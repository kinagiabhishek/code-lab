// https://leetcode.com/problems/greedy-choice-101/
package greedy;

import java.util.*;

public class LeetCode101_Greedy101 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode101_Greedy101 solver = new LeetCode101_Greedy101();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode101_Greedy101 Passed!");
    }
}
