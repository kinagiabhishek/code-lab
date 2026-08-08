// https://leetcode.com/problems/binary-search/
package binary_search;
public class BinarySearch {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int m = l + (r - l)/2;
            if (nums[m] == target) return m;
            if (nums[m] < target) l = m + 1; else r = m - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        assert new BinarySearch().search(new int[]{-1,0,3,5,9,12}, 9) == 4;
        System.out.println("✅ LeetCode704_BinarySearch Passed!");
    }
}
