// https://leetcode.com/problems/linked-list-node-446/
package linked_lists;

import java.util.*;

public class LeetCode446_LinkedLists446 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode446_LinkedLists446 solver = new LeetCode446_LinkedLists446();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode446_LinkedLists446 Passed!");
    }
}
