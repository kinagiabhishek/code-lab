// https://leetcode.com/problems/graph-network-path-266/
package graphs;

import java.util.*;

public class LeetCode266_Graphs266 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode266_Graphs266 solver = new LeetCode266_Graphs266();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode266_Graphs266 Passed!");
    }
}
