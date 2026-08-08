// https://leetcode.com/problems/problem-array-32/
package arrays_and_hashing;

import java.util.*;

public class LeetCode32_ArrayProblem32 {
    public int solve(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        return set.size();
    }
    public static void main(String[] args) {
        LeetCode32_ArrayProblem32 solver = new LeetCode32_ArrayProblem32();
        assert solver.solve(new int[]{1, 2, 2, 3}) == 3;
        System.out.println("✅ LeetCode32_ArrayProblem32 Passed!");
    }
}
