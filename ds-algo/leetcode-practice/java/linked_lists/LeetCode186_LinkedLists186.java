// https://leetcode.com/problems/linked-list-node-186/
package linked_lists;

import java.util.*;

public class LeetCode186_LinkedLists186 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode186_LinkedLists186 solver = new LeetCode186_LinkedLists186();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode186_LinkedLists186 Passed!");
    }
}
