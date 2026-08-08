// https://leetcode.com/problems/graph-network-path-240/
package graphs;

import java.util.*;

public class LeetCode240_Graphs240 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode240_Graphs240 solver = new LeetCode240_Graphs240();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode240_Graphs240 Passed!");
    }
}
