// https://leetcode.com/problems/problem-array-38/
package arrays_and_hashing;

import java.util.*;

public class LeetCode38_ArrayProblem38 {
    public int solve(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);
        return set.size();
    }
    public static void main(String[] args) {
        LeetCode38_ArrayProblem38 solver = new LeetCode38_ArrayProblem38();
        assert solver.solve(new int[]{1, 2, 2, 3}) == 3;
        System.out.println("✅ LeetCode38_ArrayProblem38 Passed!");
    }
}
