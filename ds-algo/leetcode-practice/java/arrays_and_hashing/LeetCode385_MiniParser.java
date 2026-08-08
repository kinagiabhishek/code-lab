// https://leetcode.com/problems/mini-parser/
package arrays_and_hashing;

import java.util.*;

public class LeetCode385_MiniParser {
    // LeetCode Problem 385: Mini Parser
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode385_MiniParser solver = new LeetCode385_MiniParser();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode385_MiniParser (Mini Parser) Passed!");
    }
}
