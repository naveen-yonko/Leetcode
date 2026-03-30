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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode l1=head,l2 = head,l3=head;
        for(int i=0;i<k-1;i++){
            l1= l1.next;
            l2 = l2.next;
        }
        while(l2.next!=null){
            l2 = l2.next;
            l3 = l3.next;
        }
        //System.out.println(l1.val);
        //System.out.println(l3.val);
        //l1.val = l1.val^l3.val;
        //l3.val = l1.val^l3.val;
        //l1.val = l1.val^l3.val;
        int t = l1.val;
        l1.val = l3.val;
        l3.val = t;
        return head;
    }
}