// https://leetcode.com/problems/problem-array-46/
package arrays_and_hashing;

import java.util.*;

public class LeetCode46_ArrayProblem46 {
    public int solve(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        return set.size();
    }
    public static void main(String[] args) {
        LeetCode46_ArrayProblem46 solver = new LeetCode46_ArrayProblem46();
        assert solver.solve(new int[]{1, 2, 2, 3}) == 3;
        System.out.println("✅ LeetCode46_ArrayProblem46 Passed!");
    }
}
