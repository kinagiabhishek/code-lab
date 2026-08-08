// https://leetcode.com/problems/graph-network-path-84/
package graphs;

import java.util.*;

public class LeetCode84_Graphs84 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode84_Graphs84 solver = new LeetCode84_Graphs84();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode84_Graphs84 Passed!");
    }
}
