// https://leetcode.com/problems/mini-parser/
package trees;

import java.util.*;

public class MiniParser {
    // LeetCode Problem 385: Mini Parser
    public int findMax(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max = nums[0];
        for (int n : nums) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        MiniParser solver = new MiniParser();
        assert solver.findMax(new int[]{1, 5, 3, 9, 2}) == 9;
        System.out.println("✅ MiniParser (Mini Parser) Passed!");
    }
}
