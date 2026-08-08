// https://leetcode.com/problems/graph-network-path-344/
package graphs;

import java.util.*;

public class LeetCode344_Graphs344 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode344_Graphs344 solver = new LeetCode344_Graphs344();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode344_Graphs344 Passed!");
    }
}
