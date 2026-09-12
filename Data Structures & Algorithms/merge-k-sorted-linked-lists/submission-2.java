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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)->a.val-b.val);
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for(ListNode list: lists){
            if(list!=null){
            pq.offer(list);
            }
        }
        while(!pq.isEmpty()){
            ListNode temp = pq.poll();
            curr.next = temp;
            curr=curr.next;
            if(temp.next!=null){
                pq.offer(temp.next);
            }
        }
        return dummy.next;

    }
}
