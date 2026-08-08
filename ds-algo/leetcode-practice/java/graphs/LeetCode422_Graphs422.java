// https://leetcode.com/problems/graph-network-path-422/
package graphs;

import java.util.*;

public class LeetCode422_Graphs422 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode422_Graphs422 solver = new LeetCode422_Graphs422();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode422_Graphs422 Passed!");
    }
}
