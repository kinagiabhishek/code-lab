// https://leetcode.com/problems/graph-network-path-435/
package graphs;

import java.util.*;

public class LeetCode435_Graphs435 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode435_Graphs435 solver = new LeetCode435_Graphs435();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode435_Graphs435 Passed!");
    }
}
