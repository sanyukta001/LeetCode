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
    int gcd(int x , int y)
    {
        int m = Math.min(x,y);
        int f=1;
        for(int i = 1; i <=m;i++)
        {
            if(x%i == 0 && y%i == 0)
                f = i;
        }
        return f;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode curr = head;
        while(curr.next != null)
        {
            int x = gcd(curr.val,curr.next.val);
            ListNode h = new ListNode(x);
            ListNode temp = curr.next;
            curr.next = h;
            h.next = temp;
            curr = temp;
        }
        return head;
    }
}
//=nb