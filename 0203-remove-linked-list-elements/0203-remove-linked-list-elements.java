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
    public ListNode removeElements(ListNode head, int val) {
        ListNode current = head;
        ListNode prev = head;
        if(head == null)
            return head;
        while(current != null)
        {
            if(current == head && current.val == val)
            {
                head = current.next;
                current = head;
                prev = current;
            }
            else if(current.val==val && current.next == null)
            {
                prev.next = null;
                current = null;
            }
            else if(current.val == val)
            {
                prev.next = current.next;
                current = current.next;
            }
            
            else
            {    
                prev = current ;
                current = current.next;
            }
        }
        return head;
        
    }
}