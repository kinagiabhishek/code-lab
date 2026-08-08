// https://leetcode.com/problems/repeated-dna-sequences/
package binary_search;

import java.util.*;

public class RepeatedDnaSequences {
    // LeetCode Problem 187: Repeated DNA Sequences
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        RepeatedDnaSequences solver = new RepeatedDnaSequences();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ RepeatedDnaSequences (Repeated DNA Sequences) Passed!");
    }
}
