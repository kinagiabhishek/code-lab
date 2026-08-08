// https://leetcode.com/problems/problem-array-45/
package arrays_and_hashing;

import java.util.*;

public class LeetCode45_ArrayProblem45 {
    public int solve(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        return set.size();
    }
    public static void main(String[] args) {
        LeetCode45_ArrayProblem45 solver = new LeetCode45_ArrayProblem45();
        assert solver.solve(new int[]{1, 2, 2, 3}) == 3;
        System.out.println("✅ LeetCode45_ArrayProblem45 Passed!");
    }
}
