// https://leetcode.com/problems/first-missing-positive/
package arrays_and_hashing;

import java.util.*;

public class FirstMissingPositive {
public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }
        for (int i = 0; i < n; i++) if (nums[i] != i + 1) return i + 1;
        return n + 1;
    }
    public static void main(String[] args) {
        FirstMissingPositive solver = new FirstMissingPositive();
        assert solver.firstMissingPositive(new int[]{1,2,0}) == 3;
        System.out.println("✅ FirstMissingPositive Passed!");
    }
}
