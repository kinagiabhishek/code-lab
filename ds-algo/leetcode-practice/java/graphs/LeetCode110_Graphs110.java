// https://leetcode.com/problems/graph-network-path-110/
package graphs;

import java.util.*;

public class LeetCode110_Graphs110 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode110_Graphs110 solver = new LeetCode110_Graphs110();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode110_Graphs110 Passed!");
    }
}
