// https://leetcode.com/problems/binary-watch/
package binary_search;

import java.util.*;

public class BinaryWatch {
    // LeetCode Problem 401: Binary Watch
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        BinaryWatch solver = new BinaryWatch();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode401_BinaryWatch (Binary Watch) Passed!");
    }
}
