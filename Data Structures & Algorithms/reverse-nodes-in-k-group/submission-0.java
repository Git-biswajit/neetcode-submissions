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
        if(head==null){
            return null;
        }
        int count =1;
        ListNode curr = head;
        while(curr!=null && count<k){
            curr = curr.next;
            count++;
        }
        if(curr==null){
            return head;
        }
        ListNode second = curr.next;
        curr.next = null;
        ListNode first = reverse(head);
        head.next = reverseKGroup(second,k);
        return first;
                
    }
    public ListNode reverse(ListNode node){
        ListNode curr = node;
        ListNode prev = null;
        while(curr!=null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
}
