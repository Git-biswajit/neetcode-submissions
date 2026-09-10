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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        } 
        ListNode second = slow.next;
        slow.next= null;
        ListNode first = head;
        ListNode rSec = reverse(second);
        while(rSec!=null && first!=null){
            ListNode temp = first.next;
            ListNode rTemp = rSec.next;
            first.next = rSec;
            rSec.next = temp;
            first = temp;
            rSec = rTemp;
        } 


    }
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr=temp;

        }
        return prev;
    }
}
