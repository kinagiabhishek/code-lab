// https://leetcode.com/problems/problem-array-57/
package arrays_and_hashing;

import java.util.*;

public class LeetCode57_ArrayProblem57 {
    public int solve(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        return set.size();
    }
    public static void main(String[] args) {
        LeetCode57_ArrayProblem57 solver = new LeetCode57_ArrayProblem57();
        assert solver.solve(new int[]{1, 2, 2, 3}) == 3;
        System.out.println("✅ LeetCode57_ArrayProblem57 Passed!");
    }
}
