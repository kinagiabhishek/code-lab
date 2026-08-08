// https://leetcode.com/problems/problem-array-22/
package arrays_and_hashing;

import java.util.*;

public class LeetCode22_ArrayProblem22 {
    public int solve(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        return set.size();
    }
    public static void main(String[] args) {
        LeetCode22_ArrayProblem22 solver = new LeetCode22_ArrayProblem22();
        assert solver.solve(new int[]{1, 2, 2, 3}) == 3;
        System.out.println("✅ LeetCode22_ArrayProblem22 Passed!");
    }
}
