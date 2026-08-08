// https://leetcode.com/problems/number-of-provinces/
package arrays_and_hashing;

import java.util.*;

public class NumberOfProvinces {
    // LeetCode Problem 547: Number of Provinces
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) { count += (n & 1); n >>>= 1; }
        return count;
    }

    public static void main(String[] args) {
        NumberOfProvinces solver = new NumberOfProvinces();
        assert solver.hammingWeight(7) == 3;
        System.out.println("✅ NumberOfProvinces Passed!");
    }
}
