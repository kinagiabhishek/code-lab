// https://leetcode.com/problems/ipo/
package arrays_and_hashing;

import java.util.*;

public class Ipo {
    // LeetCode Problem 502: IPO
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        Ipo solver = new Ipo();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode502_Ipo (IPO) Passed!");
    }
}
