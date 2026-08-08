// https://leetcode.com/problems/problem-array-6/
package arrays_and_hashing;

import java.util.*;

public class LeetCode6_ArrayProblem6 {
    public int solve(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        return set.size();
    }
    public static void main(String[] args) {
        LeetCode6_ArrayProblem6 solver = new LeetCode6_ArrayProblem6();
        assert solver.solve(new int[]{1, 2, 2, 3}) == 3;
        System.out.println("✅ LeetCode6_ArrayProblem6 Passed!");
    }
}
