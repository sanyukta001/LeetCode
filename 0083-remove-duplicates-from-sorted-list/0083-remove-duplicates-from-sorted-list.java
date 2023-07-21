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
    public ListNode deleteDuplicates(ListNode head) 
    {
        ListNode curr = head;
        if(head == null)
            return head;
        while(curr.next!=null)
        {
            if(curr.val == curr.next.val)
            {
                if(curr == head)
                {
                    head = head.next;
                    curr = head;
                }
                else if(curr.next.next == null)
                    curr.next = null;
                else
                {
                    ListNode d = curr.next.next;
                    curr.next = d;
                }
            }
            else
                curr = curr.next;
        }
        return head;
    }
}