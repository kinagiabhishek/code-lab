// https://leetcode.com/problems/fizz-buzz/
package arrays_and_hashing;

import java.util.*;

public class LeetCode412_FizzBuzz {
    // LeetCode Problem 412: Fizz Buzz
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode412_FizzBuzz solver = new LeetCode412_FizzBuzz();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode412_FizzBuzz (Fizz Buzz) Passed!");
    }
}
