// https://leetcode.com/problems/linked-list-node-277/
package linked_lists;

import java.util.*;

public class LeetCode277_LinkedLists277 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode277_LinkedLists277 solver = new LeetCode277_LinkedLists277();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode277_LinkedLists277 Passed!");
    }
}
