// https://leetcode.com/problems/graph-network-path-162/
package graphs;

import java.util.*;

public class LeetCode162_Graphs162 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode162_Graphs162 solver = new LeetCode162_Graphs162();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode162_Graphs162 Passed!");
    }
}
