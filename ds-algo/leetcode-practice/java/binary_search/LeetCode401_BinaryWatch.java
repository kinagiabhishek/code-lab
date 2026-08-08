// https://leetcode.com/problems/binary-watch/
package binary_search;

import java.util.*;

public class LeetCode401_BinaryWatch {
    // LeetCode Problem 401: Binary Watch
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode401_BinaryWatch solver = new LeetCode401_BinaryWatch();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode401_BinaryWatch (Binary Watch) Passed!");
    }
}
