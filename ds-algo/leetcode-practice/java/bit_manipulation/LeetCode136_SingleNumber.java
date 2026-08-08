package bit_manipulation;

public class LeetCode136_SingleNumber {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) res ^= num;
        return res;
    }
    public static void main(String[] args) {
        LeetCode136_SingleNumber solver = new LeetCode136_SingleNumber();
        assert solver.singleNumber(new int[]{2, 2, 1}) == 1;
        assert solver.singleNumber(new int[]{4, 1, 2, 1, 2}) == 4;
        System.out.println("✅ LeetCode136_SingleNumber Passed!");
    }
}
