// https://leetcode.com/problems/greedy-choice-478/
package greedy;

import java.util.*;

public class LeetCode478_Greedy478 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode478_Greedy478 solver = new LeetCode478_Greedy478();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode478_Greedy478 Passed!");
    }
}
