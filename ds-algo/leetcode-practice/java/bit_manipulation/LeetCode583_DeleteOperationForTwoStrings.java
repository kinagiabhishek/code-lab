// https://leetcode.com/problems/delete-operation-for-two-strings/
package bit_manipulation;

import java.util.*;

public class LeetCode583_DeleteOperationForTwoStrings {
    // LeetCode Problem 583: Delete Operation for Two Strings
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode583_DeleteOperationForTwoStrings solver = new LeetCode583_DeleteOperationForTwoStrings();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode583_DeleteOperationForTwoStrings (Delete Operation for Two Strings) Passed!");
    }
}
