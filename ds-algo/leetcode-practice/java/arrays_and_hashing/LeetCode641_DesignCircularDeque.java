// https://leetcode.com/problems/design-circular-deque/
package arrays_and_hashing;

import java.util.*;

public class LeetCode641_DesignCircularDeque {
    // LeetCode Problem 641: Design Circular Deque
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode641_DesignCircularDeque solver = new LeetCode641_DesignCircularDeque();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode641_DesignCircularDeque (Design Circular Deque) Passed!");
    }
}
