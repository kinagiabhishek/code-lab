// https://leetcode.com/problems/graph-network-path-461/
package graphs;

import java.util.*;

public class LeetCode461_Graphs461 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode461_Graphs461 solver = new LeetCode461_Graphs461();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode461_Graphs461 Passed!");
    }
}
