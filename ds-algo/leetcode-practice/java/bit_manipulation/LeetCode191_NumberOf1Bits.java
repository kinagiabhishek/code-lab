// https://leetcode.com/problems/number-of-1-bits/
package bit_manipulation;
public class LeetCode191_NumberOf1Bits {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n &= (n - 1);
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        assert new LeetCode191_NumberOf1Bits().hammingWeight(11) == 3;
        System.out.println("✅ LeetCode191_NumberOf1Bits Passed!");
    }
}
