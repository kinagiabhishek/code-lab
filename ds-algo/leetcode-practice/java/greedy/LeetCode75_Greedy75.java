// https://leetcode.com/problems/greedy-choice-75/
package greedy;

import java.util.*;

public class LeetCode75_Greedy75 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode75_Greedy75 solver = new LeetCode75_Greedy75();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode75_Greedy75 Passed!");
    }
}
