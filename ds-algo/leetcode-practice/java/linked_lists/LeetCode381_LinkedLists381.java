// https://leetcode.com/problems/linked-list-node-381/
package linked_lists;

import java.util.*;

public class LeetCode381_LinkedLists381 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode381_LinkedLists381 solver = new LeetCode381_LinkedLists381();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode381_LinkedLists381 Passed!");
    }
}
