// https://leetcode.com/problems/greedy-choice-153/
package greedy;

import java.util.*;

public class LeetCode153_Greedy153 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode153_Greedy153 solver = new LeetCode153_Greedy153();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode153_Greedy153 Passed!");
    }
}
