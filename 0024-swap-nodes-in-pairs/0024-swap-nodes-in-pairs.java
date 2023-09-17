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
    public ListNode swapPairs(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        int c = 0;
        if(head == null)
        {
            return head;
        }
        while(curr != null && curr.next != null)
        {
            ListNode temp = curr.next.next;
            ListNode t = curr.next;
            t.next = curr;
            curr.next = temp;
            if(c == 0)
                head = t;
            else
            {
                prev.next = t;
            }
            prev = curr;
            curr = temp;
            c++;
        }
        return head;
    }
}
//nb=