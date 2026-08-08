// https://leetcode.com/problems/graph-network-path-500/
package graphs;

import java.util.*;

public class LeetCode500_Graphs500 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode500_Graphs500 solver = new LeetCode500_Graphs500();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode500_Graphs500 Passed!");
    }
}
