// https://leetcode.com/problems/problem-array-48/
package arrays_and_hashing;

import java.util.*;

public class LeetCode48_ArrayProblem48 {
    public int solve(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        return set.size();
    }
    public static void main(String[] args) {
        LeetCode48_ArrayProblem48 solver = new LeetCode48_ArrayProblem48();
        assert solver.solve(new int[]{1, 2, 2, 3}) == 3;
        System.out.println("✅ LeetCode48_ArrayProblem48 Passed!");
    }
}
