// https://leetcode.com/problems/subarray-sum-equals-k/
package arrays_and_hashing;

import java.util.*;

public class SubarraySumEqualsK {
public int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        Map<Integer, Integer> map = new HashMap<>(); map.put(0, 1);
        for (int n : nums) {
            sum += n;
            if (map.containsKey(sum - k)) count += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        SubarraySumEqualsK solver = new SubarraySumEqualsK();
        assert solver.subarraySum(new int[]{1,1,1}, 2) == 2;
        System.out.println("✅ SubarraySumEqualsK Passed!");
    }
}
