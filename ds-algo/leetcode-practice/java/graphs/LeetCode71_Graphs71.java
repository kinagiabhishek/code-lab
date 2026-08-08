// https://leetcode.com/problems/graph-network-path-71/
package graphs;

import java.util.*;

public class LeetCode71_Graphs71 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode71_Graphs71 solver = new LeetCode71_Graphs71();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode71_Graphs71 Passed!");
    }
}
