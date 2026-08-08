// https://leetcode.com/problems/problem-greedy-539/
package greedy;

import java.util.*;

public class LeetCode539_GreedyProblem539 {
    public int solve(int[] nums) {
        int max = nums[0], curr = nums[0];
        for (int i = 1; i < nums.length; i++) {
            curr = Math.max(nums[i], curr + nums[i]); max = Math.max(max, curr);
        }
        return max;
    }
    public static void main(String[] args) {
        LeetCode539_GreedyProblem539 solver = new LeetCode539_GreedyProblem539();
        assert solver.solve(new int[]{-2,1,-3,4,-1,2,1,-5,4}) == 6;
        System.out.println("✅ LeetCode539_GreedyProblem539 Passed!");
    }
}
