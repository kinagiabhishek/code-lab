// https://leetcode.com/problems/house-robber/
package dynamic_programming;
public class LeetCode198_HouseRobber {
    public int rob(int[] nums) {
        int rob1 = 0, rob2 = 0;
        for (int n : nums) { int temp = Math.max(n + rob1, rob2); rob1 = rob2; rob2 = temp; }
        return rob2;
    }
    public static void main(String[] args) {
        assert new LeetCode198_HouseRobber().rob(new int[]{1, 2, 3, 1}) == 4;
        System.out.println("✅ LeetCode198_HouseRobber Passed!");
    }
}
