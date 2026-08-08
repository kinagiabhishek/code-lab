// https://leetcode.com/problems/greedy-choice-62/
package greedy;

import java.util.*;

public class LeetCode62_Greedy62 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode62_Greedy62 solver = new LeetCode62_Greedy62();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode62_Greedy62 Passed!");
    }
}
