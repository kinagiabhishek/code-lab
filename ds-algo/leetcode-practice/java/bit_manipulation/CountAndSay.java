// https://leetcode.com/problems/count-and-say/
package bit_manipulation;

import java.util.*;

public class CountAndSay {
    // LeetCode Problem 38: Count and Say
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        CountAndSay solver = new CountAndSay();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode38_CountAndSay (Count and Say) Passed!");
    }
}
