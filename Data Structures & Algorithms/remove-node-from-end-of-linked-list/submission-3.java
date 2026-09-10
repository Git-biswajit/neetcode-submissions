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

        ListNode rev = reverse(head);
        if (n == 1) {
            rev = rev.next;
        } else{
        ListNode newH = rev;
        ListNode prev = null;
        int count=1;
        while(newH!=null){
            if(count==n){
                prev.next = newH.next;
                break;
            }
            prev = newH;
            newH = newH.next;
            count++;
        }
        }
        return reverse(rev);
    }
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
