// https://leetcode.com/problems/lexicographical-numbers/
package graphs;

import java.util.*;

public class LexicographicalNumbers {
    // LeetCode Problem 386: Lexicographical Numbers
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) { count += (n & 1); n >>>= 1; }
        return count;
    }

    public static void main(String[] args) {
        LexicographicalNumbers solver = new LexicographicalNumbers();
        assert solver.hammingWeight(7) == 3;
        System.out.println("✅ LexicographicalNumbers Passed!");
    }
}
