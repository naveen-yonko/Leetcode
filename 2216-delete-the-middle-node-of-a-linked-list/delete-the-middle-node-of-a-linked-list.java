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
    public ListNode deleteMiddle(ListNode head) {
        ListNode fst=head,slo=head,prev=head;
        while(fst!=null && fst.next != null){
            fst = fst.next.next;
            prev = slo;
            slo = slo.next;
        }
        if(slo != fst){
        prev.next=slo.next;
        //slo.next=null;
        return head;
        }
        else{
            return null;
        }
    }
}