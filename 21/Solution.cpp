/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* mergeTwoLists(ListNode* l1, ListNode* l2) {

        ListNode* temp_node = new ListNode(0);
        ListNode* current_node = temp_node;

        while(l1 != NULL && l2 != NULL) {
            if(l1 -> val < l2 -> val) {
                current_node -> next = l1;
                l1 = l1 -> next;
            } else {
                current_node -> next = l2;
                l2 = l2 -> next;
            }

            current_node = current_node -> next;
        }

        if(l1 != NULL) {
            current_node -> next = l1;
            l1 = l1 -> next;
        }

        if(l2 != NULL) {
            current_node -> next = l2;
            l2 = l2 -> next;
        }

        return temp_node -> next;
    }
};
