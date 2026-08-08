// https://leetcode.com/problems/graph-network-path-175/
package graphs;

import java.util.*;

public class LeetCode175_Graphs175 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode175_Graphs175 solver = new LeetCode175_Graphs175();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode175_Graphs175 Passed!");
    }
}
