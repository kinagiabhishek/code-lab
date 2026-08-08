// https://leetcode.com/problems/graph-network-path-279/
package graphs;

import java.util.*;

public class LeetCode279_Graphs279 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode279_Graphs279 solver = new LeetCode279_Graphs279();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode279_Graphs279 Passed!");
    }
}
