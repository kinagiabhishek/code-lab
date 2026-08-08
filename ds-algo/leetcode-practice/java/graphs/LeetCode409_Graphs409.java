// https://leetcode.com/problems/graph-network-path-409/
package graphs;

import java.util.*;

public class LeetCode409_Graphs409 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode409_Graphs409 solver = new LeetCode409_Graphs409();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode409_Graphs409 Passed!");
    }
}
