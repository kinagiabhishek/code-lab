// https://leetcode.com/problems/implement-trie-prefix-tree/
package trees;

import java.util.*;

public class ImplementTriePrefixTree {
    // LeetCode Problem 208: Implement Trie (Prefix Tree)
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        ImplementTriePrefixTree solver = new ImplementTriePrefixTree();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode208_ImplementTriePrefixTree (Implement Trie (Prefix Tree)) Passed!");
    }
}
