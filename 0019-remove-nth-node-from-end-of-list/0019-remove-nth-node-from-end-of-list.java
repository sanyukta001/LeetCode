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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode curr = head;
        while(curr != null)
        {
            size++;
            curr = curr.next;
        }
        curr = head;
        ListNode prev = head;
        for(int i = 1; i <= size-n; i++)
        {
            prev = curr;
            curr = curr.next;
        }
        if(curr == head)
        {
            head = head.next;
        }
        if(curr.next == null)
        {
            prev.next = null;
        }
        else
        {
            prev.next = curr.next;
        }
        return head;
    }
}
//nb=