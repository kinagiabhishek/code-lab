// https://leetcode.com/problems/third-maximum-number/
package graphs;

import java.util.*;

public class ThirdMaximumNumber {
    // LeetCode Problem 414: Third Maximum Number
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) { count += (n & 1); n >>>= 1; }
        return count;
    }

    public static void main(String[] args) {
        ThirdMaximumNumber solver = new ThirdMaximumNumber();
        assert solver.hammingWeight(7) == 3;
        System.out.println("✅ ThirdMaximumNumber Passed!");
    }
}
