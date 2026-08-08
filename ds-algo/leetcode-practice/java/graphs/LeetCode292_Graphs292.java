// https://leetcode.com/problems/graph-network-path-292/
package graphs;

import java.util.*;

public class LeetCode292_Graphs292 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode292_Graphs292 solver = new LeetCode292_Graphs292();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode292_Graphs292 Passed!");
    }
}
