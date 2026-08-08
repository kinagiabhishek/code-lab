// https://leetcode.com/problems/problem-array-23/
package arrays_and_hashing;

import java.util.*;

public class LeetCode23_ArrayProblem23 {
    public int solve(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        return set.size();
    }
    public static void main(String[] args) {
        LeetCode23_ArrayProblem23 solver = new LeetCode23_ArrayProblem23();
        assert solver.solve(new int[]{1, 2, 2, 3}) == 3;
        System.out.println("✅ LeetCode23_ArrayProblem23 Passed!");
    }
}
