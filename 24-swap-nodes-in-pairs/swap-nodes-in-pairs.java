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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){return head;}
        ListNode dummy = new ListNode(-1,head);
        ListNode prev,nxt,l1,l2;
        prev = dummy;
        l1=head;
        while( l1 != null && l1.next != null){
            l2=l1.next;
            nxt = l2.next;

            l2.next = l1;
            l1.next=nxt;
            prev.next = l2;
            
            prev =l1;
            l1=nxt;
        }
        return dummy.next;
    }
}