// https://leetcode.com/problems/graph-network-path-136/
package graphs;

import java.util.*;

public class LeetCode136_Graphs136 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode136_Graphs136 solver = new LeetCode136_Graphs136();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode136_Graphs136 Passed!");
    }
}
