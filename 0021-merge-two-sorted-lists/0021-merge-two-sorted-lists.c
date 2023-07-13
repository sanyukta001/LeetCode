/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2)
{
    struct ListNode* nnew = NULL;
    struct ListNode* cp;
    if(list1 == NULL && list2 == NULL)
        return nnew;
    if(list1 == NULL && list2 != NULL)
        return list2;
    if(list1 != NULL && list2 == NULL)
        return list1;
    if(list1->val > list2->val)
    {
        nnew = list2;
        list2 = list2->next;
    }
    else
    {
        nnew = list1;
        list1 = list1->next;
    }
    cp = nnew;
    while(list1 != NULL && list2 != NULL)
    {
        if(list1->val > list2->val)
    {
        cp->next = list2;
        cp = cp->next;
        list2 = list2->next;
    }
    else
    {
        cp->next = list1;
        list1 = list1->next;
        cp = cp->next;
    }
    }
    while(list1 != NULL)
    {
        cp->next = list1;
        list1 = list1->next;
        cp = cp->next;
    }       
    while(list2 != NULL)
    {
        cp->next = list2;
        cp = cp->next;
        list2 = list2->next;
    }
    return nnew;

}