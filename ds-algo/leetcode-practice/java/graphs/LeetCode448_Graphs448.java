// https://leetcode.com/problems/graph-network-path-448/
package graphs;

import java.util.*;

public class LeetCode448_Graphs448 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode448_Graphs448 solver = new LeetCode448_Graphs448();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode448_Graphs448 Passed!");
    }
}
