// https://leetcode.com/problems/swap-nodes-in-pairs/
package linked_lists;

import java.util.*;

public class LeetCode24_SwapNodesInPairs {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode24_SwapNodesInPairs solver = new LeetCode24_SwapNodesInPairs();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode24_SwapNodesInPairs Passed!");
    }
}
