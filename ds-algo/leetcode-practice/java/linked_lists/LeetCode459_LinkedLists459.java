// https://leetcode.com/problems/linked-list-node-459/
package linked_lists;

import java.util.*;

public class LeetCode459_LinkedLists459 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode459_LinkedLists459 solver = new LeetCode459_LinkedLists459();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode459_LinkedLists459 Passed!");
    }
}
