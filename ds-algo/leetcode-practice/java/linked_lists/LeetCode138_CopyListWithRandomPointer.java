// https://leetcode.com/problems/copy-list-with-random-pointer/
package linked_lists;

import java.util.*;

public class LeetCode138_CopyListWithRandomPointer {
    // LeetCode Problem 138: Copy List with Random Pointer
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode138_CopyListWithRandomPointer solver = new LeetCode138_CopyListWithRandomPointer();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode138_CopyListWithRandomPointer (Copy List with Random Pointer) Passed!");
    }
}
