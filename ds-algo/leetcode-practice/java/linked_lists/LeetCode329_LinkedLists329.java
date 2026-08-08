// https://leetcode.com/problems/linked-list-node-329/
package linked_lists;

import java.util.*;

public class LeetCode329_LinkedLists329 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode329_LinkedLists329 solver = new LeetCode329_LinkedLists329();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode329_LinkedLists329 Passed!");
    }
}
