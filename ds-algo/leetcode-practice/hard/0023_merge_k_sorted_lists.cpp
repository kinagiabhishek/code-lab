/**
 * LeetCode 23: Merge k Sorted Lists
 * Link: https://leetcode.com/problems/merge-k-sorted-lists/
 * Difficulty: Hard
 */

#include <iostream>
#include <vector>
#include <queue>
#include <cassert>

using namespace std;

struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(nullptr) {}
};

struct Compare {
    bool operator()(ListNode* a, ListNode* b) {
        return a->val > b->val;
    }
};

class Solution {
public:
    ListNode* mergeKLists(vector<ListNode*>& lists) {
        priority_queue<ListNode*, vector<ListNode*>, Compare> pq;
        for (auto l : lists) {
            if (l) pq.push(l);
        }
        ListNode dummy(0);
        ListNode* tail = &dummy;
        while (!pq.empty()) {
            ListNode* node = pq.top();
            pq.pop();
            tail->next = node;
            tail = tail->next;
            if (node->next) pq.push(node->next);
        }
        return dummy.next;
    }
};

int main() {
    Solution sol;
    ListNode* l1 = new ListNode(1); l1->next = new ListNode(4); l1->next->next = new ListNode(5);
    ListNode* l2 = new ListNode(1); l2->next = new ListNode(3); l2->next->next = new ListNode(4);
    ListNode* l3 = new ListNode(2); l3->next = new ListNode(6);
    vector<ListNode*> lists = {l1, l2, l3};
    ListNode* merged = sol.mergeKLists(lists);
    assert(merged->val == 1);
    cout << "Test MergeKSortedLists Passed!" << endl;
    return 0;
}
