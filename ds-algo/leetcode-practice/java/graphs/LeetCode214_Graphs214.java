// https://leetcode.com/problems/graph-network-path-214/
package graphs;

import java.util.*;

public class LeetCode214_Graphs214 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode214_Graphs214 solver = new LeetCode214_Graphs214();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode214_Graphs214 Passed!");
    }
}
