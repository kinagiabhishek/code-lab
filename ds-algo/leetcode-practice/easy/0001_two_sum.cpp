/**
 * LeetCode 1: Two Sum
 * Link: https://leetcode.com/problems/two-sum/
 * Difficulty: Easy
 */

#include <iostream>
#include <vector>
#include <unordered_map>
#include <cassert>

using namespace std;

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int> mp;
        for (int i = 0; i < nums.size(); i++) {
            int complement = target - nums[i];
            if (mp.count(complement)) {
                return {mp[complement], i};
            }
            mp[nums[i]] = i;
        }
        return {};
    }
};

int main() {
    Solution sol;
    vector<int> nums = {2, 7, 11, 15};
    int target = 9;
    vector<int> res = sol.twoSum(nums, target);
    assert(res == vector<int>({0, 1}));
    cout << "Test TwoSum Passed!" << endl;
    return 0;
}
