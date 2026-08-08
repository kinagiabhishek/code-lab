// https://leetcode.com/problems/linked-list-node-212/
package linked_lists;

import java.util.*;

public class LeetCode212_LinkedLists212 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode212_LinkedLists212 solver = new LeetCode212_LinkedLists212();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode212_LinkedLists212 Passed!");
    }
}
