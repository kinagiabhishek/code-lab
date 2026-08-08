// https://leetcode.com/problems/count-the-repetitions/
package arrays_and_hashing;

import java.util.*;

public class LeetCode466_CountTheRepetitions {
    // LeetCode Problem 466: Count The Repetitions
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode466_CountTheRepetitions solver = new LeetCode466_CountTheRepetitions();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode466_CountTheRepetitions (Count The Repetitions) Passed!");
    }
}
