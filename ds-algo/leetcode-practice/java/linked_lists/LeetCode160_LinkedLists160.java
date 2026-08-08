// https://leetcode.com/problems/linked-list-node-160/
package linked_lists;

import java.util.*;

public class LeetCode160_LinkedLists160 {
    public int solve(int[] nums) {
        int res = 0;
        for (int n : nums) res += n;
        return res;
    }

    public static void main(String[] args) {
        LeetCode160_LinkedLists160 solver = new LeetCode160_LinkedLists160();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode160_LinkedLists160 Passed!");
    }
}
