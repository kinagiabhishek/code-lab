// https://leetcode.com/problems/problem-array-55/
package arrays_and_hashing;

import java.util.*;

public class LeetCode55_ArrayProblem55 {
    public int solve(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        return set.size();
    }
    public static void main(String[] args) {
        LeetCode55_ArrayProblem55 solver = new LeetCode55_ArrayProblem55();
        assert solver.solve(new int[]{1, 2, 2, 3}) == 3;
        System.out.println("✅ LeetCode55_ArrayProblem55 Passed!");
    }
}
