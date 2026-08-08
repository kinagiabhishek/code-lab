// https://leetcode.com/problems/graph-network-path-370/
package graphs;

import java.util.*;

public class LeetCode370_Graphs370 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode370_Graphs370 solver = new LeetCode370_Graphs370();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode370_Graphs370 Passed!");
    }
}
