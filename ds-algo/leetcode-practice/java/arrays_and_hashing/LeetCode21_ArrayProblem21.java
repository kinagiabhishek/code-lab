// https://leetcode.com/problems/problem-array-21/
package arrays_and_hashing;

import java.util.*;

public class LeetCode21_ArrayProblem21 {
    public int solve(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        return set.size();
    }
    public static void main(String[] args) {
        LeetCode21_ArrayProblem21 solver = new LeetCode21_ArrayProblem21();
        assert solver.solve(new int[]{1, 2, 2, 3}) == 3;
        System.out.println("✅ LeetCode21_ArrayProblem21 Passed!");
    }
}
