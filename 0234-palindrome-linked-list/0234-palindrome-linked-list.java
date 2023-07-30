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
    public boolean isPalindrome(ListNode head) {
        //int num = 0;
        String num = "";
        ListNode current = head;
        while(current != null)
        {
            num = num + current.val;
            current = current.next;
        }
        int i = 0;
        int j = num.length()-1;
        while(i<=j)
        {
            if(num.charAt(i) != num.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
        // int cpy = num;
        // int rev = 0;
        // while(cpy>0)
        // {
        //     rev = rev*10 + (cpy%10);
        //     cpy = cpy/10;
        // }
        // if(num == rev)
        //     return true;
        // else
        //     return false;
    }
}