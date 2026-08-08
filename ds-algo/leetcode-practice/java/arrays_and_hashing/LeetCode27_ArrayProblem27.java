// https://leetcode.com/problems/problem-array-27/
package arrays_and_hashing;

import java.util.*;

public class LeetCode27_ArrayProblem27 {
    public int solve(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        return set.size();
    }
    public static void main(String[] args) {
        LeetCode27_ArrayProblem27 solver = new LeetCode27_ArrayProblem27();
        assert solver.solve(new int[]{1, 2, 2, 3}) == 3;
        System.out.println("✅ LeetCode27_ArrayProblem27 Passed!");
    }
}
