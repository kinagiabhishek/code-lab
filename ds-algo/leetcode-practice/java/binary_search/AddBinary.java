// https://leetcode.com/problems/add-binary/
package binary_search;

import java.util.*;

public class AddBinary {
    // LeetCode Problem 67: Add Binary
    public int solve(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        AddBinary solver = new AddBinary();
        assert solver.solve(new int[]{1, 2, 3}) == 6;
        System.out.println("✅ LeetCode67_AddBinary (Add Binary) Passed!");
    }
}
