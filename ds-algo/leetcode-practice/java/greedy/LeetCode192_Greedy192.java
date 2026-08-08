// https://leetcode.com/problems/greedy-choice-192/
package greedy;

import java.util.*;

public class LeetCode192_Greedy192 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode192_Greedy192 solver = new LeetCode192_Greedy192();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode192_Greedy192 Passed!");
    }
}
