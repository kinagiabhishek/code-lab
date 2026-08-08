// https://leetcode.com/problems/graph-network-path-383/
package graphs;

import java.util.*;

public class LeetCode383_Graphs383 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode383_Graphs383 solver = new LeetCode383_Graphs383();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode383_Graphs383 Passed!");
    }
}
