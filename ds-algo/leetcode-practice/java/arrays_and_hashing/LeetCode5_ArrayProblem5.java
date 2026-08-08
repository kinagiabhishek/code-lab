// https://leetcode.com/problems/problem-array-5/
package arrays_and_hashing;

import java.util.*;

public class LeetCode5_ArrayProblem5 {
    public int solve(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        return set.size();
    }
    public static void main(String[] args) {
        LeetCode5_ArrayProblem5 solver = new LeetCode5_ArrayProblem5();
        assert solver.solve(new int[]{1, 2, 2, 3}) == 3;
        System.out.println("✅ LeetCode5_ArrayProblem5 Passed!");
    }
}
