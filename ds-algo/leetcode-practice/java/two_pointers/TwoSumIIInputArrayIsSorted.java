// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
package two_pointers;

import java.util.*;

public class TwoSumIIInputArrayIsSorted {
public int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;
        while (l < r) {
            int sum = numbers[l] + numbers[r];
            if (sum == target) return new int[]{l + 1, r + 1};
            if (sum < target) l++; else r--;
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        TwoSumIIInputArrayIsSorted solver = new TwoSumIIInputArrayIsSorted();
        assert Arrays.equals(solver.twoSum(new int[]{2,7,11,15}, 9), new int[]{1,2});
        System.out.println("✅ TwoSumIIInputArrayIsSorted Passed!");
    }
}
