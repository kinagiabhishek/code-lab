// https://leetcode.com/problems/missing-number/
package arrays_and_hashing;
public class LeetCode268_MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;
        for (int num : nums) sum -= num;
        return sum;
    }
    public static void main(String[] args) {
        assert new LeetCode268_MissingNumber().missingNumber(new int[]{3,0,1}) == 2;
        System.out.println("✅ LeetCode268_MissingNumber Passed!");
    }
}
