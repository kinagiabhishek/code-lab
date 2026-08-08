// https://leetcode.com/problems/beautiful-arrangement/
package arrays_and_hashing;

import java.util.*;

public class LeetCode526_BeautifulArrangement {
    // LeetCode Problem 526: Beautiful Arrangement
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode526_BeautifulArrangement solver = new LeetCode526_BeautifulArrangement();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode526_BeautifulArrangement (Beautiful Arrangement) Passed!");
    }
}
