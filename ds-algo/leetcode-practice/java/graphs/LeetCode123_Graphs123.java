// https://leetcode.com/problems/graph-network-path-123/
package graphs;

import java.util.*;

public class LeetCode123_Graphs123 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode123_Graphs123 solver = new LeetCode123_Graphs123();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode123_Graphs123 Passed!");
    }
}
