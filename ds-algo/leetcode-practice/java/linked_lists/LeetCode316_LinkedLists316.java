// https://leetcode.com/problems/linked-list-node-316/
package linked_lists;

import java.util.*;

public class LeetCode316_LinkedLists316 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode316_LinkedLists316 solver = new LeetCode316_LinkedLists316();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode316_LinkedLists316 Passed!");
    }
}
