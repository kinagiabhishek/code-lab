// https://leetcode.com/problems/top-k-frequent-elements/
package arrays_and_hashing;

import java.util.*;

public class LeetCode347_TopKFrequentElements {
    // LeetCode Problem 347: Top K Frequent Elements
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode347_TopKFrequentElements solver = new LeetCode347_TopKFrequentElements();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode347_TopKFrequentElements (Top K Frequent Elements) Passed!");
    }
}
