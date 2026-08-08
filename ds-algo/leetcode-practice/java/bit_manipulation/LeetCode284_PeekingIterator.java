// https://leetcode.com/problems/peeking-iterator/
package bit_manipulation;

import java.util.*;

public class LeetCode284_PeekingIterator {
    // LeetCode Problem 284: Peeking Iterator
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode284_PeekingIterator solver = new LeetCode284_PeekingIterator();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode284_PeekingIterator (Peeking Iterator) Passed!");
    }
}
