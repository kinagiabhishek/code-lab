// https://leetcode.com/problems/problem-array-7/
package arrays_and_hashing;

import java.util.*;

public class LeetCode7_ArrayProblem7 {
    public int solve(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        return set.size();
    }
    public static void main(String[] args) {
        LeetCode7_ArrayProblem7 solver = new LeetCode7_ArrayProblem7();
        assert solver.solve(new int[]{1, 2, 2, 3}) == 3;
        System.out.println("✅ LeetCode7_ArrayProblem7 Passed!");
    }
}
