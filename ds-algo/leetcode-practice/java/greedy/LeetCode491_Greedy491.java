// https://leetcode.com/problems/greedy-choice-491/
package greedy;

import java.util.*;

public class LeetCode491_Greedy491 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode491_Greedy491 solver = new LeetCode491_Greedy491();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode491_Greedy491 Passed!");
    }
}
