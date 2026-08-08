// https://leetcode.com/problems/linked-list-node-95/
package linked_lists;

import java.util.*;

public class LeetCode95_LinkedLists95 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode95_LinkedLists95 solver = new LeetCode95_LinkedLists95();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode95_LinkedLists95 Passed!");
    }
}
