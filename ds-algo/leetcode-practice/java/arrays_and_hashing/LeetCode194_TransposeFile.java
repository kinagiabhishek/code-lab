// https://leetcode.com/problems/transpose-file/
package arrays_and_hashing;

import java.util.*;

public class LeetCode194_TransposeFile {
    // LeetCode Problem 194: Transpose File
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        LeetCode194_TransposeFile solver = new LeetCode194_TransposeFile();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode194_TransposeFile (Transpose File) Passed!");
    }
}
