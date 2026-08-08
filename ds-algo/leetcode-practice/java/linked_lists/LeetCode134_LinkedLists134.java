// https://leetcode.com/problems/linked-list-node-134/
package linked_lists;

import java.util.*;

public class LeetCode134_LinkedLists134 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode134_LinkedLists134 solver = new LeetCode134_LinkedLists134();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode134_LinkedLists134 Passed!");
    }
}
