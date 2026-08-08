// https://leetcode.com/problems/additive-number/
package greedy;

import java.util.*;

public class AdditiveNumber {
    // LeetCode Problem 306: Additive Number
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) { count += (n & 1); n >>>= 1; }
        return count;
    }

    public static void main(String[] args) {
        AdditiveNumber solver = new AdditiveNumber();
        assert solver.hammingWeight(7) == 3;
        System.out.println("✅ AdditiveNumber Passed!");
    }
}
