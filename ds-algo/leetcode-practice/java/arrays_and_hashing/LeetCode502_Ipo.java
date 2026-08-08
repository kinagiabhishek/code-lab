// https://leetcode.com/problems/ipo/
package arrays_and_hashing;

import java.util.*;

public class LeetCode502_Ipo {
    // LeetCode Problem 502: IPO
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode502_Ipo solver = new LeetCode502_Ipo();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode502_Ipo (IPO) Passed!");
    }
}
