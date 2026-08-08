// https://leetcode.com/problems/problem-array-60/
package arrays_and_hashing;

import java.util.*;

public class LeetCode60_ArrayProblem60 {
    public int solve(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        return set.size();
    }
    public static void main(String[] args) {
        LeetCode60_ArrayProblem60 solver = new LeetCode60_ArrayProblem60();
        assert solver.solve(new int[]{1, 2, 2, 3}) == 3;
        System.out.println("✅ LeetCode60_ArrayProblem60 Passed!");
    }
}
