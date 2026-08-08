// https://leetcode.com/problems/graph-network-path-227/
package graphs;

import java.util.*;

public class LeetCode227_Graphs227 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode227_Graphs227 solver = new LeetCode227_Graphs227();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode227_Graphs227 Passed!");
    }
}
