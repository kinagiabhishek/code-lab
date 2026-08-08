// https://leetcode.com/problems/word-break/
package dynamic_programming;
import java.util.*;
public class LeetCode139_WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && set.contains(s.substring(j, i))) {
                    dp[i] = true; break;
                }
            }
        }
        return dp[s.length()];
    }
    public static void main(String[] args) {
        assert new LeetCode139_WordBreak().wordBreak("leetcode", Arrays.asList("leet", "code")) == true;
        System.out.println("✅ LeetCode139_WordBreak Passed!");
    }
}
