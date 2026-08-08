/**
 * LeetCode 206: Reverse Linked List
 * Link: https://leetcode.com/problems/reverse-linked-list/
 * Difficulty: Easy
 */

#include <iostream>
#include <cassert>

using namespace std;

struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(nullptr) {}
};

class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        ListNode* prev = nullptr;
        ListNode* curr = head;
        while (curr != nullptr) {
            ListNode* nextTemp = curr->next;
            curr->next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
};

int main() {
    Solution sol;
    ListNode* head = new ListNode(1);
    head->next = new ListNode(2);
    head->next->next = new ListNode(3);

    ListNode* reversed = sol.reverseList(head);
    assert(reversed->val == 3);
    assert(reversed->next->val == 2);
    assert(reversed->next->next->val == 1);
    cout << "Test ReverseLinkedList Passed!" << endl;
    return 0;
}
