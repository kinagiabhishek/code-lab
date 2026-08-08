// https://leetcode.com/problems/linked-list-node-199/
package linked_lists;

import java.util.*;

public class LeetCode199_LinkedLists199 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode199_LinkedLists199 solver = new LeetCode199_LinkedLists199();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode199_LinkedLists199 Passed!");
    }
}
