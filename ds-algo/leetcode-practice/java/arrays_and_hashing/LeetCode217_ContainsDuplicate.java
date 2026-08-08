package arrays_and_hashing;
import java.util.HashSet;
import java.util.Set;

public class LeetCode217_ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) return true;
            set.add(num);
        }
        return false;
    }
    public static void main(String[] args) {
        LeetCode217_ContainsDuplicate solver = new LeetCode217_ContainsDuplicate();
        assert solver.containsDuplicate(new int[]{1, 2, 3, 1}) == true;
        assert solver.containsDuplicate(new int[]{1, 2, 3, 4}) == false;
        System.out.println("✅ LeetCode217_ContainsDuplicate Passed!");
    }
}
