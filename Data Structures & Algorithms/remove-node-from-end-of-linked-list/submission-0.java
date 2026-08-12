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
    head = reverse(head);
    ListNode prev = null;
    ListNode curr = head;
    int count =1;
    while(curr!=null){
        if(count==n){
            if(prev==null){
                head = head.next;
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
    head = reverse(head);
    return head;
       
    }
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr=nxt;
        }
        return prev;
    }
}
