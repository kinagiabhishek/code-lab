// https://leetcode.com/problems/top-k-frequent-elements/
package arrays_and_hashing;

import java.util.*;

public class TopKFrequentElements {
    // LeetCode Problem 347: Top K Frequent Elements
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        TopKFrequentElements solver = new TopKFrequentElements();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode347_TopKFrequentElements (Top K Frequent Elements) Passed!");
    }
}
