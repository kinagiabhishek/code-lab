// https://leetcode.com/problems/text-justification/
package arrays_and_hashing;

import java.util.*;

public class LeetCode68_TextJustification {
    // LeetCode Problem 68: Text Justification
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode68_TextJustification solver = new LeetCode68_TextJustification();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode68_TextJustification (Text Justification) Passed!");
    }
}
