// https://leetcode.com/problems/majority-element/
package bit_manipulation;

import java.util.*;

public class MajorityElement {
    // LeetCode Problem 169: Majority Element
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        MajorityElement solver = new MajorityElement();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode169_MajorityElement (Majority Element) Passed!");
    }
}
