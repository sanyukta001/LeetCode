/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = 0;
        ListNode res = new ListNode(0);
        ListNode curr = res;
        while(l1 != null || l2 != null)
        {
            if(l1 != null)
            {
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null)
            {
                sum+= l2.val;
                l2 = l2.next;
            }
            curr.next = new ListNode(sum%10);
            curr = curr.next;
            sum = sum /10;
        }
        if(sum > 0)
            curr.next = new ListNode(sum%10);
        return res.next;
    }
}
//nb=
// int sum = 0;
//         ListNode result(0);
//         ListNode *current = &result;

//         while(l1 || l2)
//         {
//             if(l1)
//             {
//                 sum += l1->val;
//                 l1 = l1->next;
//             }

//             if(l2)
//             {
//                 sum += l2->val;
//                 l2 = l2->next;
//             }

//             current->next = new ListNode(sum % 10);
//             current = current->next;
//             sum = sum / 10;
//         }

//         if(sum > 0)
//         {
//             current->next = new ListNode(sum % 10);
//         }

//         return result.next;