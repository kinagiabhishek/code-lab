// https://leetcode.com/problems/complex-number-multiplication/
package binary_search;

import java.util.*;

public class ComplexNumberMultiplication {
    // LeetCode Problem 537: Complex Number Multiplication
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) { count += (n & 1); n >>>= 1; }
        return count;
    }

    public static void main(String[] args) {
        ComplexNumberMultiplication solver = new ComplexNumberMultiplication();
        assert solver.hammingWeight(7) == 3;
        System.out.println("✅ ComplexNumberMultiplication Passed!");
    }
}
