// https://leetcode.com/problems/graph-network-path-188/
package graphs;

import java.util.*;

public class LeetCode188_Graphs188 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode188_Graphs188 solver = new LeetCode188_Graphs188();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode188_Graphs188 Passed!");
    }
}
