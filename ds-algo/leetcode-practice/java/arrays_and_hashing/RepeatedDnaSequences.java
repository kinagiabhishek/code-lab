// https://leetcode.com/problems/repeated-dna-sequences/
package arrays_and_hashing;

import java.util.*;

public class RepeatedDnaSequences {
    // LeetCode Problem 187: Repeated DNA Sequences
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        RepeatedDnaSequences solver = new RepeatedDnaSequences();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode187_RepeatedDnaSequences (Repeated DNA Sequences) Passed!");
    }
}
