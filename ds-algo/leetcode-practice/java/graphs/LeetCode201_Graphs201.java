// https://leetcode.com/problems/graph-network-path-201/
package graphs;

import java.util.*;

public class LeetCode201_Graphs201 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode201_Graphs201 solver = new LeetCode201_Graphs201();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode201_Graphs201 Passed!");
    }
}
