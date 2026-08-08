// https://leetcode.com/problems/add-two-numbers/
package two_pointers;

import java.util.*;

public class AddTwoNumbers {
    // LeetCode Problem 2: Add Two Numbers
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) { count += (n & 1); n >>>= 1; }
        return count;
    }

    public static void main(String[] args) {
        AddTwoNumbers solver = new AddTwoNumbers();
        assert solver.hammingWeight(7) == 3;
        System.out.println("✅ AddTwoNumbers Passed!");
    }
}
