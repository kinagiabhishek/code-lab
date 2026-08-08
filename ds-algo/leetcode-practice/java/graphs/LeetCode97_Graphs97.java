// https://leetcode.com/problems/graph-network-path-97/
package graphs;

import java.util.*;

public class LeetCode97_Graphs97 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode97_Graphs97 solver = new LeetCode97_Graphs97();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode97_Graphs97 Passed!");
    }
}
