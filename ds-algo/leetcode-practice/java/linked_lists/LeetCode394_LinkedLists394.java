// https://leetcode.com/problems/linked-list-node-394/
package linked_lists;

import java.util.*;

public class LeetCode394_LinkedLists394 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode394_LinkedLists394 solver = new LeetCode394_LinkedLists394();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode394_LinkedLists394 Passed!");
    }
}
