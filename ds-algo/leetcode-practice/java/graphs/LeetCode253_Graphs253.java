// https://leetcode.com/problems/graph-network-path-253/
package graphs;

import java.util.*;

public class LeetCode253_Graphs253 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode253_Graphs253 solver = new LeetCode253_Graphs253();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode253_Graphs253 Passed!");
    }
}
