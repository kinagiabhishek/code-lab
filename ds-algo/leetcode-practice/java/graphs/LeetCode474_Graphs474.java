// https://leetcode.com/problems/graph-network-path-474/
package graphs;

import java.util.*;

public class LeetCode474_Graphs474 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode474_Graphs474 solver = new LeetCode474_Graphs474();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode474_Graphs474 Passed!");
    }
}
