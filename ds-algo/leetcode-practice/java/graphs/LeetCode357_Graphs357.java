// https://leetcode.com/problems/graph-network-path-357/
package graphs;

import java.util.*;

public class LeetCode357_Graphs357 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode357_Graphs357 solver = new LeetCode357_Graphs357();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode357_Graphs357 Passed!");
    }
}
