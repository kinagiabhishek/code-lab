package binary_search;

public class LeetCode704_BinarySearch {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] < target) l = mid + 1;
            else r = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        LeetCode704_BinarySearch solver = new LeetCode704_BinarySearch();
        assert solver.search(new int[]{-1,0,3,5,9,12}, 9) == 4;
        assert solver.search(new int[]{-1,0,3,5,9,12}, 2) == -1;
        System.out.println("✅ LeetCode704_BinarySearch Passed!");
    }
}
