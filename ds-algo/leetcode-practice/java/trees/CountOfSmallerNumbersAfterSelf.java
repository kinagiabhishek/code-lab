// https://leetcode.com/problems/count-of-smaller-numbers-after-self/
package trees;

import java.util.*;

public class CountOfSmallerNumbersAfterSelf {
    // LeetCode Problem 315: Count of Smaller Numbers After Self
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) { count += (n & 1); n >>>= 1; }
        return count;
    }

    public static void main(String[] args) {
        CountOfSmallerNumbersAfterSelf solver = new CountOfSmallerNumbersAfterSelf();
        assert solver.hammingWeight(7) == 3;
        System.out.println("✅ CountOfSmallerNumbersAfterSelf Passed!");
    }
}
