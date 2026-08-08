// https://leetcode.com/problems/greedy-choice-283/
package greedy;

import java.util.*;

public class LeetCode283_Greedy283 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode283_Greedy283 solver = new LeetCode283_Greedy283();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode283_Greedy283 Passed!");
    }
}
