// https://leetcode.com/problems/linked-list-node-290/
package linked_lists;

import java.util.*;

public class LeetCode290_LinkedLists290 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode290_LinkedLists290 solver = new LeetCode290_LinkedLists290();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode290_LinkedLists290 Passed!");
    }
}
