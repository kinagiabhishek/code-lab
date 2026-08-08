// https://leetcode.com/problems/linked-list-node-498/
package linked_lists;

import java.util.*;

public class LeetCode498_LinkedLists498 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode498_LinkedLists498 solver = new LeetCode498_LinkedLists498();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode498_LinkedLists498 Passed!");
    }
}
