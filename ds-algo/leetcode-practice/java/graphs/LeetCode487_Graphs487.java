// https://leetcode.com/problems/graph-network-path-487/
package graphs;

import java.util.*;

public class LeetCode487_Graphs487 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode487_Graphs487 solver = new LeetCode487_Graphs487();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode487_Graphs487 Passed!");
    }
}
