// https://leetcode.com/problems/problem-array-50/
package arrays_and_hashing;

import java.util.*;

public class LeetCode50_ArrayProblem50 {
    public int solve(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        return set.size();
    }
    public static void main(String[] args) {
        LeetCode50_ArrayProblem50 solver = new LeetCode50_ArrayProblem50();
        assert solver.solve(new int[]{1, 2, 2, 3}) == 3;
        System.out.println("✅ LeetCode50_ArrayProblem50 Passed!");
    }
}
