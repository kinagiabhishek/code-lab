package two_pointers;

public class LeetCode11_ContainerWithMostWater {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int max = 0;
        while (l < r) {
            int h = Math.min(height[l], height[r]);
            max = Math.max(max, h * (r - l));
            if (height[l] < height[r]) l++;
            else r--;
        }
        return max;
    }
    public static void main(String[] args) {
        LeetCode11_ContainerWithMostWater solver = new LeetCode11_ContainerWithMostWater();
        assert solver.maxArea(new int[]{1,8,6,2,5,4,8,3,7}) == 49;
        System.out.println("✅ LeetCode11_ContainerWithMostWater Passed!");
    }
}
