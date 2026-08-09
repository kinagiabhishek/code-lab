// https://leetcode.com/problems/array-partition/
package arrays_and_hashing;

import java.util.*;

public class ArrayPartition {
public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        ArrayPartition solver = new ArrayPartition();
        assert solver.arrayPairSum(new int[]{1, 4, 3, 2}) == 4;
        assert solver.arrayPairSum(new int[]{6, 2, 6, 5, 1, 2}) == 9;
        System.out.println("✅ ArrayPartition Passed!");
    }
}
