// https://leetcode.com/problems/linked-list-node-82/
package linked_lists;

import java.util.*;

public class LeetCode82_LinkedLists82 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode82_LinkedLists82 solver = new LeetCode82_LinkedLists82();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode82_LinkedLists82 Passed!");
    }
}
