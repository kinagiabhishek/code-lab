package arrays_and_hashing;
import java.util.*;
public class LeetCode271_EncodeAndDecodeStrings {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) sb.append(s.length()).append('#').append(s);
        return sb.toString();
    }
    public List<String> decode(String s) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            int slash = s.indexOf('#', i);
            int len = Integer.parseInt(s.substring(i, slash));
            i = slash + 1 + len;
            res.add(s.substring(slash + 1, i));
        }
        return res;
    }
    public static void main(String[] args) {
        LeetCode271_EncodeAndDecodeStrings codec = new LeetCode271_EncodeAndDecodeStrings();
        List<String> input = Arrays.asList("lint","code","love","you");
        assert codec.decode(codec.encode(input)).equals(input);
        System.out.println("✅ LeetCode271_EncodeAndDecodeStrings Passed!");
    }
}
