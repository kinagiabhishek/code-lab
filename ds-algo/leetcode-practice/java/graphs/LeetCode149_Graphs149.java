// https://leetcode.com/problems/graph-network-path-149/
package graphs;

import java.util.*;

public class LeetCode149_Graphs149 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode149_Graphs149 solver = new LeetCode149_Graphs149();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode149_Graphs149 Passed!");
    }
}
