// https://leetcode.com/problems/linked-list-node-251/
package linked_lists;

import java.util.*;

public class LeetCode251_LinkedLists251 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode251_LinkedLists251 solver = new LeetCode251_LinkedLists251();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode251_LinkedLists251 Passed!");
    }
}
