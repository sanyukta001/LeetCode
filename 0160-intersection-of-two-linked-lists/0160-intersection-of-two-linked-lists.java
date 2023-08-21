/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    int calc(ListNode x)
    {
        int c = 0;
        ListNode curr = x;
        while(curr != null)
        {
            c++;
            curr = curr.next;
        }
        return c;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode aa = headB;
        int a1 = calc(headA);
        int a2 = calc(headB);
        if(a == null || aa == null)
            return null;
        while(a1>a2)
        {
            a = a.next;
            a1--;
        }
        while(a2>a1)
        {
            aa = aa.next;
            a2--;
        }
        while(a != null)
        {
            if(a == aa)
                return a;
            a = a.next;
            aa = aa.next;
        }
        return null;
    }
}