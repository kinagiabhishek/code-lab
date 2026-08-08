// https://leetcode.com/problems/greedy-choice-361/
package greedy;

import java.util.*;

public class LeetCode361_Greedy361 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode361_Greedy361 solver = new LeetCode361_Greedy361();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode361_Greedy361 Passed!");
    }
}
