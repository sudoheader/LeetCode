/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* mergeTwoLists(struct ListNode* l1, struct ListNode* l2){

    struct ListNode temp_node;
    struct ListNode* current_node = &temp_node;

    if(l1 == NULL) {
        return l2;
    }

    if(l2 == NULL) {
        return l1;
    }

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

    return(temp_node.next);
}
