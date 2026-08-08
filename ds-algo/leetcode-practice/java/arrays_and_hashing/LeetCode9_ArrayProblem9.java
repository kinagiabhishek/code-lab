// https://leetcode.com/problems/problem-array-9/
package arrays_and_hashing;

import java.util.*;

public class LeetCode9_ArrayProblem9 {
    public int solve(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        return set.size();
    }
    public static void main(String[] args) {
        LeetCode9_ArrayProblem9 solver = new LeetCode9_ArrayProblem9();
        assert solver.solve(new int[]{1, 2, 2, 3}) == 3;
        System.out.println("✅ LeetCode9_ArrayProblem9 Passed!");
    }
}
