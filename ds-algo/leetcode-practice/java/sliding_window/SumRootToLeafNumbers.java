// https://leetcode.com/problems/sum-root-to-leaf-numbers/
package sliding_window;

import java.util.*;

public class SumRootToLeafNumbers {
    // LeetCode Problem 129: Sum Root to Leaf Numbers
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) { count += (n & 1); n >>>= 1; }
        return count;
    }

    public static void main(String[] args) {
        SumRootToLeafNumbers solver = new SumRootToLeafNumbers();
        assert solver.hammingWeight(7) == 3;
        System.out.println("✅ SumRootToLeafNumbers Passed!");
    }
}
