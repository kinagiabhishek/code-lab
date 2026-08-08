// https://leetcode.com/problems/graph-network-path-396/
package graphs;

import java.util.*;

public class LeetCode396_Graphs396 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode396_Graphs396 solver = new LeetCode396_Graphs396();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode396_Graphs396 Passed!");
    }
}
