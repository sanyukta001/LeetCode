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
    // int maximum(ListNode* head)
    // {
    //     ListNode* current = head;
    //     int m = current->val;
    //     while(current != NULL)
    //     {
    //         if(m<current->val)
    //             m = current->val;
    //         current = current->next;
    //     }
    //     return m;
    // }
    ListNode* removeNodes(ListNode* head) 
    {
//         int c = 0;   
//         ListNode* current = head;
//         int x = maximum(current);
//         while(current->next != NULL)
//         {
//             ListNode* ptr = head;
//             c++;
//             if(current->val < x)
//             {
//                 ListNode* temp = current->next;
//                 current->next = NULL;
//                 current = temp;
//             }
//             if(c == 1 && current->val == x)
//             {
//                 head = current;
//                 ptr = current;
//                 int x = maximum(ptr->next);
//             }
//             if(current->val == x)
//             {
//                 ptr->next = current;
//                 ptr = current;
//                 x = maximum(ptr->next);
//             }
            
//         }
        if(head == NULL || head->next == NULL)
            return head;
        ListNode* node = removeNodes(head->next);
        if(head->val < node->val)
        {
            return node;
        }
        head->next = node;
        return head;
    }
};