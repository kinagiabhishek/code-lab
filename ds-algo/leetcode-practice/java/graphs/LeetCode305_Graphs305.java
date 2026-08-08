// https://leetcode.com/problems/graph-network-path-305/
package graphs;

import java.util.*;

public class LeetCode305_Graphs305 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode305_Graphs305 solver = new LeetCode305_Graphs305();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode305_Graphs305 Passed!");
    }
}
