// https://leetcode.com/problems/linked-list-node-407/
package linked_lists;

import java.util.*;

public class LeetCode407_LinkedLists407 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode407_LinkedLists407 solver = new LeetCode407_LinkedLists407();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode407_LinkedLists407 Passed!");
    }
}
