// https://leetcode.com/problems/linked-list-node-368/
package linked_lists;

import java.util.*;

public class LeetCode368_LinkedLists368 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode368_LinkedLists368 solver = new LeetCode368_LinkedLists368();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode368_LinkedLists368 Passed!");
    }
}
