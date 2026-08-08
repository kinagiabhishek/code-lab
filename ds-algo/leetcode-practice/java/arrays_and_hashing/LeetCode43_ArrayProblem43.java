// https://leetcode.com/problems/problem-array-43/
package arrays_and_hashing;

import java.util.*;

public class LeetCode43_ArrayProblem43 {
    public int solve(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        return set.size();
    }
    public static void main(String[] args) {
        LeetCode43_ArrayProblem43 solver = new LeetCode43_ArrayProblem43();
        assert solver.solve(new int[]{1, 2, 2, 3}) == 3;
        System.out.println("✅ LeetCode43_ArrayProblem43 Passed!");
    }
}
