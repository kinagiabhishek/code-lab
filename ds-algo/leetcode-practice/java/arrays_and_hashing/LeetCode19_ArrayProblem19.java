// https://leetcode.com/problems/problem-array-19/
package arrays_and_hashing;

import java.util.*;

public class LeetCode19_ArrayProblem19 {
    public int solve(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        return set.size();
    }
    public static void main(String[] args) {
        LeetCode19_ArrayProblem19 solver = new LeetCode19_ArrayProblem19();
        assert solver.solve(new int[]{1, 2, 2, 3}) == 3;
        System.out.println("✅ LeetCode19_ArrayProblem19 Passed!");
    }
}
