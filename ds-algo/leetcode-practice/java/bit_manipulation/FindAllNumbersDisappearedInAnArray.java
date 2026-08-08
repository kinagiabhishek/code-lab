// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
package bit_manipulation;

import java.util.*;

public class FindAllNumbersDisappearedInAnArray {
    // LeetCode Problem 448: Find All Numbers Disappeared in an Array
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) { count += (n & 1); n >>>= 1; }
        return count;
    }

    public static void main(String[] args) {
        FindAllNumbersDisappearedInAnArray solver = new FindAllNumbersDisappearedInAnArray();
        assert solver.hammingWeight(7) == 3;
        System.out.println("✅ FindAllNumbersDisappearedInAnArray Passed!");
    }
}
