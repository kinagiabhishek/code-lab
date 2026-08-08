// https://leetcode.com/problems/problem-array-10/
package arrays_and_hashing;

import java.util.*;

public class LeetCode10_ArrayProblem10 {
    public int solve(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        return set.size();
    }
    public static void main(String[] args) {
        LeetCode10_ArrayProblem10 solver = new LeetCode10_ArrayProblem10();
        assert solver.solve(new int[]{1, 2, 2, 3}) == 3;
        System.out.println("✅ LeetCode10_ArrayProblem10 Passed!");
    }
}
