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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        ListNode curr = l1;
        ListNode curr2 = l2;
        ListNode later = null;
        ListNode prev = null;
        while(curr != null)
        {
            later = curr.next;
            curr.next = prev;
            prev = curr;
            curr = later;   
        }
        l1 = prev;
        later = null;
        prev = null;
        while(curr2 != null)
        {
            later = curr2.next;
            curr2.next = prev;
            prev = curr2;
            curr2 = later;   
        }
        l2 = prev;
        int carry = 0;
        ListNode result=null;
        curr = result;
        while(l1!=null && l2!=null)
        {
            int sum = l1.val + l2.val + carry;
            l1=l1.next;
            l2=l2.next;
            carry = sum/10;
                 // result.val = sum%10;
                // result.next = null;
               ListNode c = new ListNode(sum%10,null);
                if(result ==null)
                {
                    result = c;
                    curr = result;
                }
                else
                {
                    // curr.next = c;
                    // curr = curr.next;
                    c.next = curr;
                    result = c;
                    curr = c;
                }
        }
        while(l1!=null)
        {
            int sum = l1.val +  carry;
             l1=l1.next;
            carry = sum/10;
            ListNode c = new ListNode(sum%10,null);
                if(result ==null)
                {
                    result = c;
                    curr = result;
                }
                else
                {
                    // curr.next = c;
                    // curr = curr.next;
                    c.next = curr;
                    result = c;
                    curr = c;
                }
        }
        while(l2!=null)
        {
            int sum = l2.val +  carry;
            carry = sum/10;
            l2=l2.next;
            ListNode c = new ListNode(sum%10,null);
                if(result ==null)
                {
                    result = c;
                    curr = result;
                }
                else
                {
                    // curr.next = c;
                    // curr = curr.next;
                    c.next = curr;
                    result = c;
                    curr = c;
                }
        }
        if(carry != 0)
        {
            ListNode c = new ListNode(carry,null);
            if(result ==null)
                {
                    result = c;
                    curr = result;
                }
                else
                {
                    // curr.next = c;
                    // curr = curr.next;
                    c.next = curr;
                    result = c;
                    curr = c;
                }
        }
        return result;
    }
}