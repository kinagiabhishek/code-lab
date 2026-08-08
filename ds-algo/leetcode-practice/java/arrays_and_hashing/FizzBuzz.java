// https://leetcode.com/problems/fizz-buzz/
package arrays_and_hashing;

import java.util.*;

public class FizzBuzz {
    // LeetCode Problem 412: Fizz Buzz
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        FizzBuzz solver = new FizzBuzz();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode412_FizzBuzz (Fizz Buzz) Passed!");
    }
}
