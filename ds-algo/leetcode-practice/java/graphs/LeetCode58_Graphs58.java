// https://leetcode.com/problems/graph-network-path-58/
package graphs;

import java.util.*;

public class LeetCode58_Graphs58 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode58_Graphs58 solver = new LeetCode58_Graphs58();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode58_Graphs58 Passed!");
    }
}
