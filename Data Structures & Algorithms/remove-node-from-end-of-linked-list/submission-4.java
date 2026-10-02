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
        ListNode curr = rev;
        ListNode prev = null;
        int count =1;
        while(curr!=null){
            if(count==n){
                if(prev==null){
                    rev = rev.next;
                }
                else{
                    prev.next = curr.next;
                }
                break;
            }
            prev = curr;
            curr = curr.next;
            count++;
        }
        return reverse(rev);

    }
    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        while(curr!=null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
