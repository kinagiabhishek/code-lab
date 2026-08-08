// https://leetcode.com/problems/linked-list-node-225/
package linked_lists;

import java.util.*;

public class LeetCode225_LinkedLists225 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode225_LinkedLists225 solver = new LeetCode225_LinkedLists225();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode225_LinkedLists225 Passed!");
    }
}
