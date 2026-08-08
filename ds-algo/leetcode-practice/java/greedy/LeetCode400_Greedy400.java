// https://leetcode.com/problems/greedy-choice-400/
package greedy;

import java.util.*;

public class LeetCode400_Greedy400 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode400_Greedy400 solver = new LeetCode400_Greedy400();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode400_Greedy400 Passed!");
    }
}
