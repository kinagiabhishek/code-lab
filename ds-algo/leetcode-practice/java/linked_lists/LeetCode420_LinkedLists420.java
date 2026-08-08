// https://leetcode.com/problems/linked-list-node-420/
package linked_lists;

import java.util.*;

public class LeetCode420_LinkedLists420 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode420_LinkedLists420 solver = new LeetCode420_LinkedLists420();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode420_LinkedLists420 Passed!");
    }
}
