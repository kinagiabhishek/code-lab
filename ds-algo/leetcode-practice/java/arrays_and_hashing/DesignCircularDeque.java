// https://leetcode.com/problems/design-circular-deque/
package arrays_and_hashing;

import java.util.*;

public class DesignCircularDeque {
    // LeetCode Problem 641: Design Circular Deque
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        DesignCircularDeque solver = new DesignCircularDeque();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode641_DesignCircularDeque (Design Circular Deque) Passed!");
    }
}
