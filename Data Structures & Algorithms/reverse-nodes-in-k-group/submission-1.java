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
    public ListNode reverseKGroup(ListNode head, int k) {
        int count =1;
        ListNode curr = head;
        while(curr!=null){
            if(count ==k){                
                break;
            }
            curr = curr.next;
            count++;
        }
        if(count<k){
            return head;
        }
    if(curr == null){
    return head;
     }
        ListNode second = curr.next;
        curr.next = null;
        ListNode rev = reverse(head); 
        head.next = reverseKGroup(second, k);
        return rev;

    }
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
}
