// https://leetcode.com/problems/graph-network-path-318/
package graphs;

import java.util.*;

public class LeetCode318_Graphs318 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode318_Graphs318 solver = new LeetCode318_Graphs318();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode318_Graphs318 Passed!");
    }
}
