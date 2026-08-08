package arrays_and_hashing;

public class LeetCode242_ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }
        for (int count : counts) {
            if (count != 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        LeetCode242_ValidAnagram solver = new LeetCode242_ValidAnagram();
        assert solver.isAnagram("anagram", "nagaram") == true;
        assert solver.isAnagram("rat", "car") == false;
        System.out.println("✅ LeetCode242_ValidAnagram Passed!");
    }
}
