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
        ListNode dummy=new ListNode(-1,head);
        ListNode l1=dummy,l2=dummy;
        for(int i=0;i<= n;i++){l2=l2.next;}
        //System.out.println(l1.val +" "+l2.val);
        while(l2!= null){
            l1=l1.next;
            l2=l2.next;
        }
        //System.out.println(l1.val);
        //l1.next.next=null;
        l1.next=l1.next.next;
        return dummy.next;
    }
}